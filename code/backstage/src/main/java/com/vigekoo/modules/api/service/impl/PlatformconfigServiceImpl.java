package com.vigekoo.modules.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;
import com.vigekoo.modules.api.dao.PlatformconfigDao;
import com.vigekoo.modules.api.entity.Platformconfig;
import com.vigekoo.modules.api.service.PlatformconfigService;

@Service("platformconfigService")
public class PlatformconfigServiceImpl implements PlatformconfigService {

	@Autowired
	private PlatformconfigDao platformconfigDao;
	
	@Override
	public Platformconfig queryObject(Integer platformConfigId){
		return platformconfigDao.queryObject(platformConfigId);
	}
	
	@Override
	public List<Platformconfig> queryList(Map<String, Object> map){
		return platformconfigDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return platformconfigDao.queryTotal(map);
	}
	
	@Override
	public void save(Platformconfig platformconfig){
		platformconfigDao.save(platformconfig);
	}
	
	@Override
	public void update(Platformconfig platformconfig){
		platformconfigDao.update(platformconfig);
	}
	
	@Override
	public void delete(Integer platformConfigId){
		platformconfigDao.delete(platformConfigId);
	}
	
	@Override
	public void deleteBatch(Integer[] platformConfigIds){
		platformconfigDao.deleteBatch(platformConfigIds);
	}
	
}
