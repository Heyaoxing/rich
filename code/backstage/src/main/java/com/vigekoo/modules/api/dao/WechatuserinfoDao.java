package com.vigekoo.modules.api.dao;

import com.vigekoo.modules.api.entity.Wechatuserinfo;
import com.vigekoo.modules.sys.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WechatuserinfoDao extends BaseDao<Wechatuserinfo> {
	 Wechatuserinfo queryByUnionid(String unionid);
}
