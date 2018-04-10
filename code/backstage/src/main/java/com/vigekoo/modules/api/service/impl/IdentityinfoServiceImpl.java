package com.vigekoo.modules.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;
import com.vigekoo.modules.api.dao.IdentityinfoDao;
import com.vigekoo.modules.api.entity.Identityinfo;
import com.vigekoo.modules.api.service.IdentityinfoService;

@Service("identityinfoService")
public class IdentityinfoServiceImpl implements IdentityinfoService {

	@Autowired
	private IdentityinfoDao identityinfoDao;
	
	@Override
	public Identityinfo queryObject(String identityId){
		return identityinfoDao.queryObject(identityId);
	}
	
	@Override
	public List<Identityinfo> queryList(Map<String, Object> map){
		return identityinfoDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return identityinfoDao.queryTotal(map);
	}
	
	@Override
	public void save(Identityinfo identityinfo){
		identityinfoDao.save(identityinfo);
	}
	
	@Override
	public void update(Identityinfo identityinfo){
		identityinfoDao.update(identityinfo);
	}
	
	@Override
	public void delete(String identityId){
		identityinfoDao.delete(identityId);
	}
	
	@Override
	public void deleteBatch(String[] identityIds){
		identityinfoDao.deleteBatch(identityIds);
	}
	
}
