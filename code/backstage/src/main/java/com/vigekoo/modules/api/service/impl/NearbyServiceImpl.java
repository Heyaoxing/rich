package com.vigekoo.modules.api.service.impl;

import com.vigekoo.modules.api.dao.IdentityinfoDao;
import com.vigekoo.modules.api.dao.NearByMapping;
import com.vigekoo.modules.api.model.reponse.NearbyShowResponse;
import com.vigekoo.modules.api.service.NearbyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/4/9 11:08
 */
@Service ( "nearbyService" )
public class NearbyServiceImpl implements NearbyService {

    @Autowired
    private NearByMapping nearByMapping;

    public List<NearbyShowResponse> getShowMessage() {
        return nearByMapping.getShowMessage();
    }
}
