package com.vigekoo.modules.api.service;

import com.vigekoo.modules.api.entity.Rechargeinfo;
import java.util.List;
import java.util.Map;

/**
 * @author blues
 * @Description: TODO(充值记录表)
 * @date 2018-04-09 11:17:00
 */
public interface RechargeinfoService {
	
	Rechargeinfo queryObject(String rechargeId);
	
	List<Rechargeinfo> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(Rechargeinfo rechargeinfo);
	
	void update(Rechargeinfo rechargeinfo);
	
	void delete(String rechargeId);
	
	void deleteBatch(String[] rechargeIds);

}
