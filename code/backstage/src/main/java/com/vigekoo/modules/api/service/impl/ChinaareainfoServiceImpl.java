package com.vigekoo.modules.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;
import com.vigekoo.modules.api.dao.ChinaareainfoDao;
import com.vigekoo.modules.api.entity.Chinaareainfo;
import com.vigekoo.modules.api.service.ChinaareainfoService;

@Service("chinaareainfoService")
public class ChinaareainfoServiceImpl implements ChinaareainfoService {

	@Autowired
	private ChinaareainfoDao chinaareainfoDao;
	
	@Override
	public Chinaareainfo queryObject(String areaid){
		return chinaareainfoDao.queryObject(areaid);
	}
	
	@Override
	public List<Chinaareainfo> queryList(Map<String, Object> map){
		return chinaareainfoDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return chinaareainfoDao.queryTotal(map);
	}
	
	@Override
	public void save(Chinaareainfo chinaareainfo){
		chinaareainfoDao.save(chinaareainfo);
	}
	
	@Override
	public void update(Chinaareainfo chinaareainfo){
		chinaareainfoDao.update(chinaareainfo);
	}
	
	@Override
	public void delete(String areaid){
		chinaareainfoDao.delete(areaid);
	}
	
	@Override
	public void deleteBatch(String[] areaids){
		chinaareainfoDao.deleteBatch(areaids);
	}
	
}
