package com.vigekoo.modules.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;
import com.vigekoo.modules.api.dao.UseractivepropertyDao;
import com.vigekoo.modules.api.entity.Useractiveproperty;
import com.vigekoo.modules.api.service.UseractivepropertyService;

@Service("useractivepropertyService")
public class UseractivepropertyServiceImpl implements UseractivepropertyService {

	@Autowired
	private UseractivepropertyDao useractivepropertyDao;
	
	@Override
	public Useractiveproperty queryObject(String uapid){
		return useractivepropertyDao.queryObject(uapid);
	}
	
	@Override
	public List<Useractiveproperty> queryList(Map<String, Object> map){
		return useractivepropertyDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return useractivepropertyDao.queryTotal(map);
	}
	
	@Override
	public void save(Useractiveproperty useractiveproperty){
		useractivepropertyDao.save(useractiveproperty);
	}
	
	@Override
	public void update(Useractiveproperty useractiveproperty){
		useractivepropertyDao.update(useractiveproperty);
	}
	
	@Override
	public void delete(String uapid){
		useractivepropertyDao.delete(uapid);
	}
	
	@Override
	public void deleteBatch(String[] uapids){
		useractivepropertyDao.deleteBatch(uapids);
	}
	
}
