package com.vigekoo.modules.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;
import com.vigekoo.modules.api.dao.PersoninfoDao;
import com.vigekoo.modules.api.entity.Personinfo;
import com.vigekoo.modules.api.service.PersoninfoService;

@Service("personinfoService")
public class PersoninfoServiceImpl implements PersoninfoService {

	@Autowired
	private PersoninfoDao personinfoDao;
	
	@Override
	public Personinfo queryObject(Integer personId){
		return personinfoDao.queryObject(personId);
	}
	
	@Override
	public List<Personinfo> queryList(Map<String, Object> map){
		return personinfoDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return personinfoDao.queryTotal(map);
	}
	
	@Override
	public void save(Personinfo personinfo){
		personinfoDao.save(personinfo);
	}
	
	@Override
	public void update(Personinfo personinfo){
		personinfoDao.update(personinfo);
	}
	
	@Override
	public void delete(Integer personId){
		personinfoDao.delete(personId);
	}
	
	@Override
	public void deleteBatch(Integer[] personIds){
		personinfoDao.deleteBatch(personIds);
	}
	
}
