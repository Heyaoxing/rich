package com.vigekoo.modules.api.service;

import com.vigekoo.modules.api.entity.Publishrecord;
import java.util.List;
import java.util.Map;

/**
 * @author blues
 * @Description: TODO(发布记录)
 * @date 2018-04-09 11:17:00
 */
public interface PublishrecordService {
	
	Publishrecord queryObject(String publishId);
	
	List<Publishrecord> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(Publishrecord publishrecord);
	
	void update(Publishrecord publishrecord);
	
	void delete(String publishId);
	
	void deleteBatch(String[] publishIds);

}
