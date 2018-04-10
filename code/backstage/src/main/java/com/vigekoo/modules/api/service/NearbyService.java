package com.vigekoo.modules.api.service;

import com.vigekoo.modules.api.model.reponse.NearbyShowResponse;

import java.util.List;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/4/9 11:07
 */
public interface NearbyService {

    List<NearbyShowResponse> getShowMessage();
}
