package com.vigekoo.modules.api.service;

import com.vigekoo.modules.api.entity.Identitybusinessrelation;
import java.util.List;
import java.util.Map;

/**
 * @author blues
 * @Description: TODO(职业名片关系对应表)
 * @date 2018-04-09 11:17:00
 */
public interface IdentitybusinessrelationService {
	
	Identitybusinessrelation queryObject(String id);
	
	List<Identitybusinessrelation> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(Identitybusinessrelation identitybusinessrelation);
	
	void update(Identitybusinessrelation identitybusinessrelation);
	
	void delete(String id);
	
	void deleteBatch(String[] ids);

}
