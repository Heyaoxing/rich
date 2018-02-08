package com.rich.repository.dao;

import com.rich.repository.entity.ChinaAreaInfo;

public interface ChinaAreaInfoMapper {
    int deleteByPrimaryKey(String areaid);

    int insert(ChinaAreaInfo record);

    int insertSelective(ChinaAreaInfo record);

    ChinaAreaInfo selectByPrimaryKey(String areaid);

    int updateByPrimaryKeySelective(ChinaAreaInfo record);

    int updateByPrimaryKey(ChinaAreaInfo record);
}