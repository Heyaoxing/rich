package com.rich.repository.dao;

import com.rich.repository.entity.PersonInfo;

public interface PersonInfoMapper {
    int deleteByPrimaryKey(Integer personId);

    int insert(PersonInfo record);

    int insertSelective(PersonInfo record);

    PersonInfo selectByPrimaryKey(Integer personId);

    int updateByPrimaryKeySelective(PersonInfo record);

    int updateByPrimaryKey(PersonInfo record);
}