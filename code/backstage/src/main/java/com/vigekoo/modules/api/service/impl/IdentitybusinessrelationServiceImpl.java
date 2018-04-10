package com.vigekoo.modules.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;
import com.vigekoo.modules.api.dao.IdentitybusinessrelationDao;
import com.vigekoo.modules.api.entity.Identitybusinessrelation;
import com.vigekoo.modules.api.service.IdentitybusinessrelationService;

@Service("identitybusinessrelationService")
public class IdentitybusinessrelationServiceImpl implements IdentitybusinessrelationService {

	@Autowired
	private IdentitybusinessrelationDao identitybusinessrelationDao;
	
	@Override
	public Identitybusinessrelation queryObject(String id){
		return identitybusinessrelationDao.queryObject(id);
	}
	
	@Override
	public List<Identitybusinessrelation> queryList(Map<String, Object> map){
		return identitybusinessrelationDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return identitybusinessrelationDao.queryTotal(map);
	}
	
	@Override
	public void save(Identitybusinessrelation identitybusinessrelation){
		identitybusinessrelationDao.save(identitybusinessrelation);
	}
	
	@Override
	public void update(Identitybusinessrelation identitybusinessrelation){
		identitybusinessrelationDao.update(identitybusinessrelation);
	}
	
	@Override
	public void delete(String id){
		identitybusinessrelationDao.delete(id);
	}
	
	@Override
	public void deleteBatch(String[] ids){
		identitybusinessrelationDao.deleteBatch(ids);
	}
	
}
