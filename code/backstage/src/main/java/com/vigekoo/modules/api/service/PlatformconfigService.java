package com.vigekoo.modules.api.service;

import com.vigekoo.modules.api.entity.Platformconfig;
import java.util.List;
import java.util.Map;

/**
 * @author blues
 * @Description: TODO(平台配置表)
 * @date 2018-04-09 11:17:00
 */
public interface PlatformconfigService {
	
	Platformconfig queryObject(Integer platformConfigId);
	
	List<Platformconfig> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(Platformconfig platformconfig);
	
	void update(Platformconfig platformconfig);
	
	void delete(Integer platformConfigId);
	
	void deleteBatch(Integer[] platformConfigIds);

}
