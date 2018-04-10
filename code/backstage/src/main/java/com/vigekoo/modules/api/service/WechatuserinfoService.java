package com.vigekoo.modules.api.service;

import com.vigekoo.modules.api.entity.Wechatuserinfo;
import java.util.List;
import java.util.Map;

/**
 * @author blues
 * @Description: TODO(微信用户信息表)
 * @date 2018-04-09 11:17:00
 */
public interface WechatuserinfoService {
	
	Wechatuserinfo queryObject(String useRid);
	
	List<Wechatuserinfo> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(Wechatuserinfo wechatuserinfo);
	
	void update(Wechatuserinfo wechatuserinfo);
	
	void delete(String useRid);
	
	void deleteBatch(String[] useRids);

}
