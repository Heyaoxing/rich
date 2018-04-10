package com.vigekoo.modules.api.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.vigekoo.common.utils.GenerateGUIDUtils;
import com.vigekoo.common.utils.HttpUtils;
import com.vigekoo.modules.api.dao.PlatformconfigDao;
import com.vigekoo.modules.api.dao.WechatuserinfoDao;
import com.vigekoo.modules.api.entity.Platformconfig;
import com.vigekoo.modules.api.entity.Wechatuserinfo;
import com.vigekoo.modules.api.model.dto.WechatDto;
import com.vigekoo.modules.api.model.request.UserResquest;
import com.vigekoo.modules.api.service.UserService;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/4/9 17:34
 */
@Service ( "userService" )
public class UserServiceImpl implements UserService {
    private final String appId = "wxa35fada4c1983f1c";
    private final String secret = "403b184955db0a20e2436f1ef0624882";

    @Autowired
    private WechatuserinfoDao wechatuserinfoDao;

    @Autowired
    private PlatformconfigDao platformconfigDao;

    @Override
    public String registered(UserResquest resquest) {
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid=" +
                appId +
                "&secret=" +
                secret +
                "&js_code=" +
                resquest.getCode() +
                "&grant_type=authorization_code";
        try {
            String result = HttpUtils.post(url);
            WechatDto dto = JSON.parseObject(result, new TypeReference<WechatDto>() {
            });

            Wechatuserinfo wechat = wechatuserinfoDao.queryByUnionid("2"); //TODO:待修改
            if (wechat!=null) {
                return result;
            }

            Platformconfig config = platformconfigDao.queryObject(1);
            Wechatuserinfo info = new Wechatuserinfo();
            info.setActivityCount(config.getEveryActivityNum());
            info.setBusinessCount(config.getEveryBusinessNum());
            info.setUserId(GenerateGUIDUtils.generateGUID());
            info.setOpenid(dto.getOpenid());
            info.setNickname(resquest.getNickName());
            info.setAvatarurl(resquest.getAvatarUrl());
            info.setGender(resquest.getGender());
            info.setCity(resquest.getCity());
            info.setProvince(resquest.getProvince());
            info.setCountry(resquest.getCountry());
            info.setLanguage(resquest.getLanguage());
            info.setIsEnabled(1);
            info.setCreatedon(new Date());
            wechatuserinfoDao.save(info);
            return result;
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
