package com.vigekoo.modules.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;
import com.vigekoo.modules.api.dao.BusinesssortinfoDao;
import com.vigekoo.modules.api.entity.Businesssortinfo;
import com.vigekoo.modules.api.service.BusinesssortinfoService;

@Service("businesssortinfoService")
public class BusinesssortinfoServiceImpl implements BusinesssortinfoService {

	@Autowired
	private BusinesssortinfoDao businesssortinfoDao;
	
	@Override
	public Businesssortinfo queryObject(Integer sortId){
		return businesssortinfoDao.queryObject(sortId);
	}
	
	@Override
	public List<Businesssortinfo> queryList(Map<String, Object> map){
		return businesssortinfoDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return businesssortinfoDao.queryTotal(map);
	}
	
	@Override
	public void save(Businesssortinfo businesssortinfo){
		businesssortinfoDao.save(businesssortinfo);
	}
	
	@Override
	public void update(Businesssortinfo businesssortinfo){
		businesssortinfoDao.update(businesssortinfo);
	}
	
	@Override
	public void delete(Integer sortId){
		businesssortinfoDao.delete(sortId);
	}
	
	@Override
	public void deleteBatch(Integer[] sortIds){
		businesssortinfoDao.deleteBatch(sortIds);
	}
	
}
