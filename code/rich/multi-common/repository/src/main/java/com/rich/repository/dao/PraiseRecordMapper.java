package com.rich.repository.dao;

import com.rich.repository.entity.PraiseRecord;

public interface PraiseRecordMapper {
    int deleteByPrimaryKey(Integer praiseId);

    int insert(PraiseRecord record);

    int insertSelective(PraiseRecord record);

    PraiseRecord selectByPrimaryKey(Integer praiseId);

    int updateByPrimaryKeySelective(PraiseRecord record);

    int updateByPrimaryKey(PraiseRecord record);
}