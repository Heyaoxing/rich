package com.vigekoo.modules.api.controller;

import com.vigekoo.common.utils.Result;
import com.vigekoo.modules.api.model.request.UserResquest;
import com.vigekoo.modules.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/4/9 17:28
 */
@RestController
@RequestMapping ( "/api/user" )
public class UserController extends AbstractController {

    @Autowired
    private UserService userService;

    @RequestMapping ( value = "/registered" ,method = RequestMethod.POST)
    public Result registered(@RequestBody UserResquest resquest) {
        String response = userService.registered(resquest);
        return Result.ok(response);
    }
}
