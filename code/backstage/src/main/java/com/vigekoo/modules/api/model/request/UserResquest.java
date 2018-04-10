package com.vigekoo.modules.api.model.request;

import lombok.Data;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/4/9 17:30
 */
@Data
public class UserResquest {
    private String nickName;
    private String avatarUrl;
    private String gender;
    private String city;
    private String province;
    private String country;
    private String language;
    private String code;
}
