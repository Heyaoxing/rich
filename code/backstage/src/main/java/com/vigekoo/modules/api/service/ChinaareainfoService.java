package com.vigekoo.modules.api.service;

import com.vigekoo.modules.api.entity.Chinaareainfo;
import java.util.List;
import java.util.Map;

/**
 * @author blues
 * @Description: TODO(全国地理位置信息表 )
 * @date 2018-04-09 11:17:00
 */
public interface ChinaareainfoService {
	
	Chinaareainfo queryObject(String areaid);
	
	List<Chinaareainfo> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(Chinaareainfo chinaareainfo);
	
	void update(Chinaareainfo chinaareainfo);
	
	void delete(String areaid);
	
	void deleteBatch(String[] areaids);

}
