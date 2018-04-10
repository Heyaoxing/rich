package com.vigekoo.modules.api.service;

import com.vigekoo.modules.api.model.request.UserResquest;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/4/9 17:33
 */
public interface UserService {
    /**
    * @description:注册用户
    * @author 990016
    * @date 2018/4/9 17:35
    */
     String registered(UserResquest resquest);
}
