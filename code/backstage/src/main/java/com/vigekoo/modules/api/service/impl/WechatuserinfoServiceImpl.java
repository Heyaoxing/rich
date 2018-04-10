package com.vigekoo.modules.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;
import com.vigekoo.modules.api.dao.WechatuserinfoDao;
import com.vigekoo.modules.api.entity.Wechatuserinfo;
import com.vigekoo.modules.api.service.WechatuserinfoService;

@Service("wechatuserinfoService")
public class WechatuserinfoServiceImpl implements WechatuserinfoService {

	@Autowired
	private WechatuserinfoDao wechatuserinfoDao;
	
	@Override
	public Wechatuserinfo queryObject(String useRid){
		return wechatuserinfoDao.queryObject(useRid);
	}
	
	@Override
	public List<Wechatuserinfo> queryList(Map<String, Object> map){
		return wechatuserinfoDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return wechatuserinfoDao.queryTotal(map);
	}
	
	@Override
	public void save(Wechatuserinfo wechatuserinfo){
		wechatuserinfoDao.save(wechatuserinfo);
	}
	
	@Override
	public void update(Wechatuserinfo wechatuserinfo){
		wechatuserinfoDao.update(wechatuserinfo);
	}
	
	@Override
	public void delete(String useRid){
		wechatuserinfoDao.delete(useRid);
	}
	
	@Override
	public void deleteBatch(String[] useRids){
		wechatuserinfoDao.deleteBatch(useRids);
	}
	
}
