package com.rich.repository.dao;

import com.rich.repository.entity.UserActiveProperty;

public interface UserActivePropertyMapper {
    int deleteByPrimaryKey(String uapid);

    int insert(UserActiveProperty record);

    int insertSelective(UserActiveProperty record);

    UserActiveProperty selectByPrimaryKey(String uapid);

    int updateByPrimaryKeySelective(UserActiveProperty record);

    int updateByPrimaryKey(UserActiveProperty record);
}