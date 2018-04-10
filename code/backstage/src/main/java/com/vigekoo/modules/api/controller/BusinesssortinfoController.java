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
import com.vigekoo.modules.api.entity.Businesssortinfo;
import com.vigekoo.modules.api.service.BusinesssortinfoService;
import com.vigekoo.common.utils.PageUtils;
import com.vigekoo.common.utils.Query;
import com.vigekoo.common.utils.Result;

/**
 * @author blues
 * @Description: TODO(行业类目表)
 * @date 2018-04-09 11:17:00
 */
@RestController
@RequestMapping("/api/businesssortinfo")
public class BusinesssortinfoController extends AbstractController{

	@Autowired
	private BusinesssortinfoService businesssortinfoService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("api:businesssortinfo:list")
	public Result list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Businesssortinfo> businesssortinfoList = businesssortinfoService.queryList(query);
		int total = businesssortinfoService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(businesssortinfoList, total, query.getLimit(), query.getPage());
		
		return Result.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{sortId}")
	@RequiresPermissions("api:businesssortinfo:info")
	public Result info(@PathVariable("sortId") Integer sortId){
		Businesssortinfo businesssortinfo = businesssortinfoService.queryObject(sortId);
		
		return Result.ok().put("businesssortinfo", businesssortinfo);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("api:businesssortinfo:save")
	public Result save(@RequestBody Businesssortinfo businesssortinfo){
		businesssortinfoService.save(businesssortinfo);
		
		return Result.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("api:businesssortinfo:update")
	public Result update(@RequestBody Businesssortinfo businesssortinfo){
		businesssortinfoService.update(businesssortinfo);
		
		return Result.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("api:businesssortinfo:delete")
	public Result delete(@RequestBody Integer[] sortIds){
		businesssortinfoService.deleteBatch(sortIds);
		
		return Result.ok();
	}
	
}
