package com.rich.repository.dao;

import com.rich.repository.entity.PlatformConfig;

public interface PlatformConfigMapper {
    int deleteByPrimaryKey(Integer platformConfigId);

    int insert(PlatformConfig record);

    int insertSelective(PlatformConfig record);

    PlatformConfig selectByPrimaryKey(Integer platformConfigId);

    int updateByPrimaryKeySelective(PlatformConfig record);

    int updateByPrimaryKey(PlatformConfig record);
}