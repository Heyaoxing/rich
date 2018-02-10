package com.rich.api;

import com.rich.repository.dao.BusinessSortInfoMapper;
import com.rich.repository.entity.BusinessSortInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class homeController {

    @Autowired
    private BusinessSortInfoMapper businessSortInfoDao;

    @ResponseBody
    @RequestMapping ( "/index" )
    public String get() {
        BusinessSortInfo result = businessSortInfoDao.selectByPrimaryKey(1);
        return "hello" + result.getName();
    }
}
