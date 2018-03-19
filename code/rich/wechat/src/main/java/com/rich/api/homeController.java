package com.rich.api;

import com.alibaba.fastjson.JSON;
import com.rich.common.model.Page;
import com.rich.common.model.PageBaseInfo;
import com.rich.repository.dao.BusinessSortInfoMapper;
import com.rich.repository.entity.BusinessSortInfo;
import com.rich.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Controller;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
class homeController {

    @Autowired
    private BusinessSortInfoMapper businessSortInfoDao;

    @Autowired
    private TestService service;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @ResponseBody
    @RequestMapping ( "/index" )
    public PageBaseInfo<String> get() {
        service.method();
        BusinessSortInfo result = businessSortInfoDao.selectByPrimaryKey(1);
        PageBaseInfo pageBaseInfo=new PageBaseInfo();
        List list=new ArrayList();
        list.add(result.getIconUrl());
        pageBaseInfo.setContent(list);
        Page page=new Page();
        pageBaseInfo.setPageable(page);
        String key="wechatkey";
        String data= JSON.toJSONString(pageBaseInfo);
        String topic="wechattopic";
        ListenableFuture<SendResult<String, String>> resultsend = kafkaTemplate.send(topic, key, data);
        return pageBaseInfo;
    }
}
