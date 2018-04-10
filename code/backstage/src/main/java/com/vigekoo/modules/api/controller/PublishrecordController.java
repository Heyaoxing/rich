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
import com.vigekoo.modules.api.entity.Publishrecord;
import com.vigekoo.modules.api.service.PublishrecordService;
import com.vigekoo.common.utils.PageUtils;
import com.vigekoo.common.utils.Query;
import com.vigekoo.common.utils.Result;

/**
 * @author blues
 * @Description: TODO(发布记录)
 * @date 2018-04-09 11:17:00
 */
@RestController
@RequestMapping("/api/publishrecord")
public class PublishrecordController extends AbstractController{

	@Autowired
	private PublishrecordService publishrecordService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("api:publishrecord:list")
	public Result list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Publishrecord> publishrecordList = publishrecordService.queryList(query);
		int total = publishrecordService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(publishrecordList, total, query.getLimit(), query.getPage());
		
		return Result.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{publishId}")
	@RequiresPermissions("api:publishrecord:info")
	public Result info(@PathVariable("publishId") String publishId){
		Publishrecord publishrecord = publishrecordService.queryObject(publishId);
		
		return Result.ok().put("publishrecord", publishrecord);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("api:publishrecord:save")
	public Result save(@RequestBody Publishrecord publishrecord){
		publishrecordService.save(publishrecord);
		
		return Result.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("api:publishrecord:update")
	public Result update(@RequestBody Publishrecord publishrecord){
		publishrecordService.update(publishrecord);
		
		return Result.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("api:publishrecord:delete")
	public Result delete(@RequestBody String[] publishIds){
		publishrecordService.deleteBatch(publishIds);
		
		return Result.ok();
	}
	
}
