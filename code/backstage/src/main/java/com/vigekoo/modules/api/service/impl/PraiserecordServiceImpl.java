package com.vigekoo.modules.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;
import com.vigekoo.modules.api.dao.PraiserecordDao;
import com.vigekoo.modules.api.entity.Praiserecord;
import com.vigekoo.modules.api.service.PraiserecordService;

@Service("praiserecordService")
public class PraiserecordServiceImpl implements PraiserecordService {

	@Autowired
	private PraiserecordDao praiserecordDao;
	
	@Override
	public Praiserecord queryObject(String praiseId){
		return praiserecordDao.queryObject(praiseId);
	}
	
	@Override
	public List<Praiserecord> queryList(Map<String, Object> map){
		return praiserecordDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return praiserecordDao.queryTotal(map);
	}
	
	@Override
	public void save(Praiserecord praiserecord){
		praiserecordDao.save(praiserecord);
	}
	
	@Override
	public void update(Praiserecord praiserecord){
		praiserecordDao.update(praiserecord);
	}
	
	@Override
	public void delete(String praiseId){
		praiserecordDao.delete(praiseId);
	}
	
	@Override
	public void deleteBatch(String[] praiseIds){
		praiserecordDao.deleteBatch(praiseIds);
	}
	
}
