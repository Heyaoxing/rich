package com.vigekoo.modules.api.dao;

import com.vigekoo.modules.api.model.reponse.NearbyShowResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/4/9 11:48
 */
@Mapper
public interface NearByMapping {
    public List<NearbyShowResponse> getShowMessage();
}
