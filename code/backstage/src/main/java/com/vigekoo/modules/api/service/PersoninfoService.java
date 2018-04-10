package com.vigekoo.modules.api.service;

import com.vigekoo.modules.api.entity.Personinfo;
import java.util.List;
import java.util.Map;

/**
 * @author blues
 * @Description: TODO(管理人员表)
 * @date 2018-04-09 11:17:00
 */
public interface PersoninfoService {
	
	Personinfo queryObject(Integer personId);
	
	List<Personinfo> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(Personinfo personinfo);
	
	void update(Personinfo personinfo);
	
	void delete(Integer personId);
	
	void deleteBatch(Integer[] personIds);

}
