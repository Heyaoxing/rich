package com.rich.common.model;

import java.io.Serializable;

public class Page implements Serializable {

    private static final long serialVersionUID = 2443088763359877105L;

    // 当前页数
    private int pageNo;
    //每页条数
    private int pageSize;
    // 分页查询开始位置
    private int begin;
    // 分页查询结束位置
    private int end;
    // 查询结果总记录数
    private int count;

    public Page() {
    }

    public Page(int pageSize, int pageNo) {
        if (pageSize == 0) throw new RuntimeException("pageSize can't be defined as 0");
        if (pageNo == 0) throw new RuntimeException("pageNo can't be defined as 0");
        this.pageSize = pageSize;
        this.pageNo = pageNo;
        this.begin = (pageNo - 1) * pageSize;
        this.end = this.begin + pageSize;
    }

    public int getBegin() {
        return begin;
    }

    public int getEnd() {
        return end;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
        if (this.pageNo != 0) {
            if (this.begin == 0) {
                this.begin = (this.pageNo - 1) * this.pageSize;
            }
            this.pageNo = (int) Math.floor((this.begin * 1.0d) / this.pageSize) + 1;
            this.begin = (this.pageNo - 1) * this.pageSize;
            this.end = this.pageNo * this.pageSize;
        }

    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
        if (this.pageSize != 0) {
            this.begin = (pageNo - 1) * pageSize;
            this.end = pageNo * this.pageSize;
        }
    }

    /**
     * 总页数
     * @return
     */
    public int getTotalPage() {
        if (count == 0) {
            return 1;
        }
        int totalPage = (int) Math.floor((this.count * 1.0d) / this.pageSize);
        if (this.count % this.pageSize != 0) {
            totalPage ++;
        }
        return totalPage;
    }
}
