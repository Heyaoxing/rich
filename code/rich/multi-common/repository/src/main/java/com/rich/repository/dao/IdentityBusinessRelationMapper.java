package com.rich.repository.dao;

import com.rich.repository.entity.IdentityBusinessRelation;

public interface IdentityBusinessRelationMapper {
    int deleteByPrimaryKey(String id);

    int insert(IdentityBusinessRelation record);

    int insertSelective(IdentityBusinessRelation record);

    IdentityBusinessRelation selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(IdentityBusinessRelation record);

    int updateByPrimaryKey(IdentityBusinessRelation record);
}