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
import com.vigekoo.modules.api.entity.Identityinfo;
import com.vigekoo.modules.api.service.IdentityinfoService;
import com.vigekoo.common.utils.PageUtils;
import com.vigekoo.common.utils.Query;
import com.vigekoo.common.utils.Result;

/**
 * @author blues
 * @Description: TODO(名片信息表)
 * @date 2018-04-09 11:17:00
 */
@RestController
@RequestMapping("/api/identityinfo")
public class IdentityinfoController extends AbstractController{

	@Autowired
	private IdentityinfoService identityinfoService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("api:identityinfo:list")
	public Result list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Identityinfo> identityinfoList = identityinfoService.queryList(query);
		int total = identityinfoService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(identityinfoList, total, query.getLimit(), query.getPage());
		
		return Result.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{identityId}")
	@RequiresPermissions("api:identityinfo:info")
	public Result info(@PathVariable("identityId") String identityId){
		Identityinfo identityinfo = identityinfoService.queryObject(identityId);
		
		return Result.ok().put("identityinfo", identityinfo);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("api:identityinfo:save")
	public Result save(@RequestBody Identityinfo identityinfo){
		identityinfoService.save(identityinfo);
		
		return Result.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("api:identityinfo:update")
	public Result update(@RequestBody Identityinfo identityinfo){
		identityinfoService.update(identityinfo);
		
		return Result.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("api:identityinfo:delete")
	public Result delete(@RequestBody String[] identityIds){
		identityinfoService.deleteBatch(identityIds);
		
		return Result.ok();
	}
	
}
