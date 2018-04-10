package com.vigekoo.common.utils;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/4/9 14:34
 */
public class BasePage {
    //当前页数
    private int currPage;
    //每页记录数
    private int pageSize;

    public int getCurrPage() {
        return currPage;
    }

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
