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
import com.vigekoo.modules.api.entity.Rechargeinfo;
import com.vigekoo.modules.api.service.RechargeinfoService;
import com.vigekoo.common.utils.PageUtils;
import com.vigekoo.common.utils.Query;
import com.vigekoo.common.utils.Result;

/**
 * @author blues
 * @Description: TODO(充值记录表)
 * @date 2018-04-09 11:17:00
 */
@RestController
@RequestMapping("/api/rechargeinfo")
public class RechargeinfoController extends AbstractController{

	@Autowired
	private RechargeinfoService rechargeinfoService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("api:rechargeinfo:list")
	public Result list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Rechargeinfo> rechargeinfoList = rechargeinfoService.queryList(query);
		int total = rechargeinfoService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(rechargeinfoList, total, query.getLimit(), query.getPage());
		
		return Result.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{rechargeId}")
	@RequiresPermissions("api:rechargeinfo:info")
	public Result info(@PathVariable("rechargeId") String rechargeId){
		Rechargeinfo rechargeinfo = rechargeinfoService.queryObject(rechargeId);
		
		return Result.ok().put("rechargeinfo", rechargeinfo);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("api:rechargeinfo:save")
	public Result save(@RequestBody Rechargeinfo rechargeinfo){
		rechargeinfoService.save(rechargeinfo);
		
		return Result.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("api:rechargeinfo:update")
	public Result update(@RequestBody Rechargeinfo rechargeinfo){
		rechargeinfoService.update(rechargeinfo);
		
		return Result.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("api:rechargeinfo:delete")
	public Result delete(@RequestBody String[] rechargeIds){
		rechargeinfoService.deleteBatch(rechargeIds);
		
		return Result.ok();
	}
	
}
