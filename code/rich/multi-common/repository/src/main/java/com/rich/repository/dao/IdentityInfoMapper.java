package com.rich.repository.dao;

import com.rich.repository.entity.IdentityInfo;

public interface IdentityInfoMapper {
    int deleteByPrimaryKey(String identityId);

    int insert(IdentityInfo record);

    int insertSelective(IdentityInfo record);

    IdentityInfo selectByPrimaryKey(String identityId);

    int updateByPrimaryKeySelective(IdentityInfo record);

    int updateByPrimaryKeyWithBLOBs(IdentityInfo record);

    int updateByPrimaryKey(IdentityInfo record);
}