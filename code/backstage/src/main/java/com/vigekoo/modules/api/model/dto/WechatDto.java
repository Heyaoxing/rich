package com.vigekoo.modules.api.model.dto;

import lombok.Data;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/4/9 18:25
 */
@Data
public class WechatDto {
    private String session_key;
    private String openid;
    private Integer expires_in;
}
