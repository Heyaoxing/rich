package com.rich.repository.dao;

import com.rich.repository.entity.BusinessSortInfo;

public interface BusinessSortInfoMapper {
    int deleteByPrimaryKey(Integer sortId);

    int insert(BusinessSortInfo record);

    int insertSelective(BusinessSortInfo record);

    BusinessSortInfo selectByPrimaryKey(Integer sortId);

    int updateByPrimaryKeySelective(BusinessSortInfo record);

    int updateByPrimaryKey(BusinessSortInfo record);
}