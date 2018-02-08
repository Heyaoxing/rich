package com.rich.repository.dao;

import com.rich.repository.entity.RechargeInfo;

public interface RechargeInfoMapper {
    int deleteByPrimaryKey(Integer rechargeId);

    int insert(RechargeInfo record);

    int insertSelective(RechargeInfo record);

    RechargeInfo selectByPrimaryKey(Integer rechargeId);

    int updateByPrimaryKeySelective(RechargeInfo record);

    int updateByPrimaryKey(RechargeInfo record);
}