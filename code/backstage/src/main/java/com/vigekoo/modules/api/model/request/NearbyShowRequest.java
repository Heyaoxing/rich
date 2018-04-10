package com.vigekoo.modules.api.model.request;

import com.vigekoo.common.utils.BasePage;
import lombok.Data;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/4/9 11:02
 */
@Data
public class NearbyShowRequest extends BasePage {
    private String lng;
    private String lat;
}
