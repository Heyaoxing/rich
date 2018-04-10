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
import com.vigekoo.modules.api.entity.Identitybusinessrelation;
import com.vigekoo.modules.api.service.IdentitybusinessrelationService;
import com.vigekoo.common.utils.PageUtils;
import com.vigekoo.common.utils.Query;
import com.vigekoo.common.utils.Result;

/**
 * @author blues
 * @Description: TODO(职业名片关系对应表)
 * @date 2018-04-09 11:17:00
 */
@RestController
@RequestMapping("/api/identitybusinessrelation")
public class IdentitybusinessrelationController extends AbstractController{

	@Autowired
	private IdentitybusinessrelationService identitybusinessrelationService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("api:identitybusinessrelation:list")
	public Result list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Identitybusinessrelation> identitybusinessrelationList = identitybusinessrelationService.queryList(query);
		int total = identitybusinessrelationService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(identitybusinessrelationList, total, query.getLimit(), query.getPage());
		
		return Result.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("api:identitybusinessrelation:info")
	public Result info(@PathVariable("id") String id){
		Identitybusinessrelation identitybusinessrelation = identitybusinessrelationService.queryObject(id);
		
		return Result.ok().put("identitybusinessrelation", identitybusinessrelation);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("api:identitybusinessrelation:save")
	public Result save(@RequestBody Identitybusinessrelation identitybusinessrelation){
		identitybusinessrelationService.save(identitybusinessrelation);
		
		return Result.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("api:identitybusinessrelation:update")
	public Result update(@RequestBody Identitybusinessrelation identitybusinessrelation){
		identitybusinessrelationService.update(identitybusinessrelation);
		
		return Result.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("api:identitybusinessrelation:delete")
	public Result delete(@RequestBody String[] ids){
		identitybusinessrelationService.deleteBatch(ids);
		
		return Result.ok();
	}
	
}
