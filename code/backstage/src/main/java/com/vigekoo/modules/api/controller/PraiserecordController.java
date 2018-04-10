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
import com.vigekoo.modules.api.entity.Praiserecord;
import com.vigekoo.modules.api.service.PraiserecordService;
import com.vigekoo.common.utils.PageUtils;
import com.vigekoo.common.utils.Query;
import com.vigekoo.common.utils.Result;

/**
 * @author blues
 * @Description: TODO(口碑评价记录)
 * @date 2018-04-09 11:17:00
 */
@RestController
@RequestMapping("/api/praiserecord")
public class PraiserecordController extends AbstractController{

	@Autowired
	private PraiserecordService praiserecordService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("api:praiserecord:list")
	public Result list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Praiserecord> praiserecordList = praiserecordService.queryList(query);
		int total = praiserecordService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(praiserecordList, total, query.getLimit(), query.getPage());
		
		return Result.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{praiseId}")
	@RequiresPermissions("api:praiserecord:info")
	public Result info(@PathVariable("praiseId") String praiseId){
		Praiserecord praiserecord = praiserecordService.queryObject(praiseId);
		
		return Result.ok().put("praiserecord", praiserecord);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("api:praiserecord:save")
	public Result save(@RequestBody Praiserecord praiserecord){
		praiserecordService.save(praiserecord);
		
		return Result.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("api:praiserecord:update")
	public Result update(@RequestBody Praiserecord praiserecord){
		praiserecordService.update(praiserecord);
		
		return Result.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("api:praiserecord:delete")
	public Result delete(@RequestBody String[] praiseIds){
		praiserecordService.deleteBatch(praiseIds);
		
		return Result.ok();
	}
	
}
