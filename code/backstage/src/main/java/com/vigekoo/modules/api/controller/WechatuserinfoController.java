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
import com.vigekoo.modules.api.entity.Wechatuserinfo;
import com.vigekoo.modules.api.service.WechatuserinfoService;
import com.vigekoo.common.utils.PageUtils;
import com.vigekoo.common.utils.Query;
import com.vigekoo.common.utils.Result;

/**
 * @author blues
 * @Description: TODO(微信用户信息表)
 * @date 2018-04-09 11:17:00
 */
@RestController
@RequestMapping("/api/wechatuserinfo")
public class WechatuserinfoController extends AbstractController{

	@Autowired
	private WechatuserinfoService wechatuserinfoService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("api:wechatuserinfo:list")
	public Result list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Wechatuserinfo> wechatuserinfoList = wechatuserinfoService.queryList(query);
		int total = wechatuserinfoService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(wechatuserinfoList, total, query.getLimit(), query.getPage());
		
		return Result.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{useRid}")
	@RequiresPermissions("api:wechatuserinfo:info")
	public Result info(@PathVariable("useRid") String useRid){
		Wechatuserinfo wechatuserinfo = wechatuserinfoService.queryObject(useRid);
		
		return Result.ok().put("wechatuserinfo", wechatuserinfo);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("api:wechatuserinfo:save")
	public Result save(@RequestBody Wechatuserinfo wechatuserinfo){
		wechatuserinfoService.save(wechatuserinfo);
		
		return Result.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("api:wechatuserinfo:update")
	public Result update(@RequestBody Wechatuserinfo wechatuserinfo){
		wechatuserinfoService.update(wechatuserinfo);
		
		return Result.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("api:wechatuserinfo:delete")
	public Result delete(@RequestBody String[] useRids){
		wechatuserinfoService.deleteBatch(useRids);
		
		return Result.ok();
	}
	
}
