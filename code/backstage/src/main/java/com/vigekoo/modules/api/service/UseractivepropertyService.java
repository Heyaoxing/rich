package com.vigekoo.modules.api.service;

import com.vigekoo.modules.api.entity.Useractiveproperty;
import java.util.List;
import java.util.Map;

/**
 * @author blues
 * @Description: TODO(用户活跃属性)
 * @date 2018-04-09 11:17:00
 */
public interface UseractivepropertyService {
	
	Useractiveproperty queryObject(String uapid);
	
	List<Useractiveproperty> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(Useractiveproperty useractiveproperty);
	
	void update(Useractiveproperty useractiveproperty);
	
	void delete(String uapid);
	
	void deleteBatch(String[] uapids);

}
