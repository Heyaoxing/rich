package com.vigekoo.modules.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;
import com.vigekoo.modules.api.dao.RechargeinfoDao;
import com.vigekoo.modules.api.entity.Rechargeinfo;
import com.vigekoo.modules.api.service.RechargeinfoService;

@Service("rechargeinfoService")
public class RechargeinfoServiceImpl implements RechargeinfoService {

	@Autowired
	private RechargeinfoDao rechargeinfoDao;
	
	@Override
	public Rechargeinfo queryObject(String rechargeId){
		return rechargeinfoDao.queryObject(rechargeId);
	}
	
	@Override
	public List<Rechargeinfo> queryList(Map<String, Object> map){
		return rechargeinfoDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return rechargeinfoDao.queryTotal(map);
	}
	
	@Override
	public void save(Rechargeinfo rechargeinfo){
		rechargeinfoDao.save(rechargeinfo);
	}
	
	@Override
	public void update(Rechargeinfo rechargeinfo){
		rechargeinfoDao.update(rechargeinfo);
	}
	
	@Override
	public void delete(String rechargeId){
		rechargeinfoDao.delete(rechargeId);
	}
	
	@Override
	public void deleteBatch(String[] rechargeIds){
		rechargeinfoDao.deleteBatch(rechargeIds);
	}
	
}
