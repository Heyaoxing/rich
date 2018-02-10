package com.rich.repository.dao;

import com.rich.repository.entity.publishRecord;

public interface publishRecordMapper {
    int deleteByPrimaryKey(Integer publishId);

    int insert(publishRecord record);

    int insertSelective(publishRecord record);

    publishRecord selectByPrimaryKey(Integer publishId);

    int updateByPrimaryKeySelective(publishRecord record);

    int updateByPrimaryKey(publishRecord record);
}