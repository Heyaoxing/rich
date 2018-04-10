package com.vigekoo.modules.api.controller;

import com.vigekoo.common.utils.Result;
import com.vigekoo.modules.api.model.reponse.NearbyShowResponse;
import com.vigekoo.modules.api.model.request.NearbyShowRequest;
import com.vigekoo.modules.api.service.NearbyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/4/9 10:56
 */
@RestController
@RequestMapping ( "/api/nearby" )
public class NearbyController extends AbstractController {

    @Autowired
    private NearbyService nearbyService;

    @RequestMapping ( value = "/show" ,method = RequestMethod.POST )
    public Result show(@RequestBody NearbyShowRequest request) {
        try {
            List<NearbyShowResponse> result = nearbyService.getShowMessage();
            return Result.ok().put("nearbyShow", result);
        } catch (Exception e) {
            return Result.error(e.getMessage());
        }
    }
}
