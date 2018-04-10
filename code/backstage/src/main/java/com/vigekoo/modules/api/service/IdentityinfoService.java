package com.vigekoo.modules.api.service;

import com.vigekoo.modules.api.entity.Identityinfo;
import java.util.List;
import java.util.Map;

/**
 * @author blues
 * @Description: TODO(名片信息表)
 * @date 2018-04-09 11:17:00
 */
public interface IdentityinfoService {
	
	Identityinfo queryObject(String identityId);
	
	List<Identityinfo> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(Identityinfo identityinfo);
	
	void update(Identityinfo identityinfo);
	
	void delete(String identityId);
	
	void deleteBatch(String[] identityIds);

}
