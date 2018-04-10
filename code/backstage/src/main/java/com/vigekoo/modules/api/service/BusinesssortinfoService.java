package com.vigekoo.modules.api.service;

import com.vigekoo.modules.api.entity.Businesssortinfo;
import java.util.List;
import java.util.Map;

/**
 * @author blues
 * @Description: TODO(行业类目表)
 * @date 2018-04-09 11:17:00
 */
public interface BusinesssortinfoService {
	
	Businesssortinfo queryObject(Integer sortId);
	
	List<Businesssortinfo> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(Businesssortinfo businesssortinfo);
	
	void update(Businesssortinfo businesssortinfo);
	
	void delete(Integer sortId);
	
	void deleteBatch(Integer[] sortIds);

}
