package com.vigekoo.modules.api.controller;

import java.util.List;
import java.util.Map;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.vigekoo.modules.api.entity.Platformconfig;
import com.vigekoo.modules.api.service.PlatformconfigService;
import com.vigekoo.common.utils.PageUtils;
import com.vigekoo.common.utils.Query;
import com.vigekoo.common.utils.Result;

/**
 * @author blues
 * @Description: TODO(平台配置表)
 * @date 2018-04-09 11:17:00
 */
@RestController
@RequestMapping("/api/platformconfig")
public class PlatformconfigController extends AbstractController{

	@Autowired
	private PlatformconfigService platformconfigService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("api:platformconfig:list")
	public Result list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Platformconfig> platformconfigList = platformconfigService.queryList(query);
		int total = platformconfigService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(platformconfigList, total, query.getLimit(), query.getPage());
		
		return Result.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{platformConfigId}")
	@RequiresPermissions("api:platformconfig:info")
	public Result info(@PathVariable("platformConfigId") Integer platformConfigId){
		Platformconfig platformconfig = platformconfigService.queryObject(platformConfigId);
		
		return Result.ok().put("platformconfig", platformconfig);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("api:platformconfig:save")
	public Result save(@RequestBody Platformconfig platformconfig){
		platformconfigService.save(platformconfig);
		
		return Result.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("api:platformconfig:update")
	public Result update(@RequestBody Platformconfig platformconfig){
		platformconfigService.update(platformconfig);
		
		return Result.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("api:platformconfig:delete")
	public Result delete(@RequestBody Integer[] platformConfigIds){
		platformconfigService.deleteBatch(platformConfigIds);
		
		return Result.ok();
	}
	
}
