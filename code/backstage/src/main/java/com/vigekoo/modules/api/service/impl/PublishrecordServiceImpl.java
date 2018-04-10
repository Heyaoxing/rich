package com.vigekoo.modules.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;
import com.vigekoo.modules.api.dao.PublishrecordDao;
import com.vigekoo.modules.api.entity.Publishrecord;
import com.vigekoo.modules.api.service.PublishrecordService;

@Service("publishrecordService")
public class PublishrecordServiceImpl implements PublishrecordService {

	@Autowired
	private PublishrecordDao publishrecordDao;
	
	@Override
	public Publishrecord queryObject(String publishId){
		return publishrecordDao.queryObject(publishId);
	}
	
	@Override
	public List<Publishrecord> queryList(Map<String, Object> map){
		return publishrecordDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return publishrecordDao.queryTotal(map);
	}
	
	@Override
	public void save(Publishrecord publishrecord){
		publishrecordDao.save(publishrecord);
	}
	
	@Override
	public void update(Publishrecord publishrecord){
		publishrecordDao.update(publishrecord);
	}
	
	@Override
	public void delete(String publishId){
		publishrecordDao.delete(publishId);
	}
	
	@Override
	public void deleteBatch(String[] publishIds){
		publishrecordDao.deleteBatch(publishIds);
	}
	
}
