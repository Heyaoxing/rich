package com.vigekoo.modules.api.service;

import com.vigekoo.modules.api.entity.Praiserecord;
import java.util.List;
import java.util.Map;

/**
 * @author blues
 * @Description: TODO(口碑评价记录)
 * @date 2018-04-09 11:17:00
 */
public interface PraiserecordService {
	
	Praiserecord queryObject(String praiseId);
	
	List<Praiserecord> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(Praiserecord praiserecord);
	
	void update(Praiserecord praiserecord);
	
	void delete(String praiseId);
	
	void deleteBatch(String[] praiseIds);

}
