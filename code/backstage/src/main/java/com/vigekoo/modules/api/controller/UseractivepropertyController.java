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
import com.vigekoo.modules.api.entity.Useractiveproperty;
import com.vigekoo.modules.api.service.UseractivepropertyService;
import com.vigekoo.common.utils.PageUtils;
import com.vigekoo.common.utils.Query;
import com.vigekoo.common.utils.Result;

/**
 * @author blues
 * @Description: TODO(用户活跃属性)
 * @date 2018-04-09 11:17:00
 */
@RestController
@RequestMapping("/api/useractiveproperty")
public class UseractivepropertyController extends AbstractController{

	@Autowired
	private UseractivepropertyService useractivepropertyService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("api:useractiveproperty:list")
	public Result list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Useractiveproperty> useractivepropertyList = useractivepropertyService.queryList(query);
		int total = useractivepropertyService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(useractivepropertyList, total, query.getLimit(), query.getPage());
		
		return Result.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{uapid}")
	@RequiresPermissions("api:useractiveproperty:info")
	public Result info(@PathVariable("uapid") String uapid){
		Useractiveproperty useractiveproperty = useractivepropertyService.queryObject(uapid);
		
		return Result.ok().put("useractiveproperty", useractiveproperty);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("api:useractiveproperty:save")
	public Result save(@RequestBody Useractiveproperty useractiveproperty){
		useractivepropertyService.save(useractiveproperty);
		
		return Result.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("api:useractiveproperty:update")
	public Result update(@RequestBody Useractiveproperty useractiveproperty){
		useractivepropertyService.update(useractiveproperty);
		
		return Result.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("api:useractiveproperty:delete")
	public Result delete(@RequestBody String[] uapids){
		useractivepropertyService.deleteBatch(uapids);
		
		return Result.ok();
	}
	
}
