package com.rich.repository.dao;

import com.rich.repository.entity.WechatUserInfo;

public interface WechatUserInfoMapper {
    int deleteByPrimaryKey(String useRid);

    int insert(WechatUserInfo record);

    int insertSelective(WechatUserInfo record);

    WechatUserInfo selectByPrimaryKey(String useRid);

    int updateByPrimaryKeySelective(WechatUserInfo record);

    int updateByPrimaryKey(WechatUserInfo record);
}