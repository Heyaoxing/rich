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
import com.vigekoo.modules.api.entity.Chinaareainfo;
import com.vigekoo.modules.api.service.ChinaareainfoService;
import com.vigekoo.common.utils.PageUtils;
import com.vigekoo.common.utils.Query;
import com.vigekoo.common.utils.Result;

/**
 * @author blues
 * @Description: TODO(全国地理位置信息表 )
 * @date 2018-04-09 11:17:00
 */
@RestController
@RequestMapping("/api/chinaareainfo")
public class ChinaareainfoController extends AbstractController{

	@Autowired
	private ChinaareainfoService chinaareainfoService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("api:chinaareainfo:list")
	public Result list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Chinaareainfo> chinaareainfoList = chinaareainfoService.queryList(query);
		int total = chinaareainfoService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(chinaareainfoList, total, query.getLimit(), query.getPage());
		
		return Result.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{areaid}")
	@RequiresPermissions("api:chinaareainfo:info")
	public Result info(@PathVariable("areaid") String areaid){
		Chinaareainfo chinaareainfo = chinaareainfoService.queryObject(areaid);
		
		return Result.ok().put("chinaareainfo", chinaareainfo);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("api:chinaareainfo:save")
	public Result save(@RequestBody Chinaareainfo chinaareainfo){
		chinaareainfoService.save(chinaareainfo);
		
		return Result.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("api:chinaareainfo:update")
	public Result update(@RequestBody Chinaareainfo chinaareainfo){
		chinaareainfoService.update(chinaareainfo);
		
		return Result.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("api:chinaareainfo:delete")
	public Result delete(@RequestBody String[] areaids){
		chinaareainfoService.deleteBatch(areaids);
		
		return Result.ok();
	}
	
}
