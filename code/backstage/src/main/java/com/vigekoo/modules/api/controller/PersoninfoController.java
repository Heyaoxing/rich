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
import com.vigekoo.modules.api.entity.Personinfo;
import com.vigekoo.modules.api.service.PersoninfoService;
import com.vigekoo.common.utils.PageUtils;
import com.vigekoo.common.utils.Query;
import com.vigekoo.common.utils.Result;

/**
 * @author blues
 * @Description: TODO(管理人员表)
 * @date 2018-04-09 11:17:00
 */
@RestController
@RequestMapping("/api/personinfo")
public class PersoninfoController extends AbstractController{

	@Autowired
	private PersoninfoService personinfoService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("api:personinfo:list")
	public Result list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Personinfo> personinfoList = personinfoService.queryList(query);
		int total = personinfoService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(personinfoList, total, query.getLimit(), query.getPage());
		
		return Result.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{personId}")
	@RequiresPermissions("api:personinfo:info")
	public Result info(@PathVariable("personId") Integer personId){
		Personinfo personinfo = personinfoService.queryObject(personId);
		
		return Result.ok().put("personinfo", personinfo);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("api:personinfo:save")
	public Result save(@RequestBody Personinfo personinfo){
		personinfoService.save(personinfo);
		
		return Result.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("api:personinfo:update")
	public Result update(@RequestBody Personinfo personinfo){
		personinfoService.update(personinfo);
		
		return Result.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("api:personinfo:delete")
	public Result delete(@RequestBody Integer[] personIds){
		personinfoService.deleteBatch(personIds);
		
		return Result.ok();
	}
	
}
