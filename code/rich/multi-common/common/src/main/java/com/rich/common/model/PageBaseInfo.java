package com.rich.common.model;

import java.io.Serializable;
import java.util.List;

public class PageBaseInfo<E> implements Serializable {

    private static final long serialVersionUID = -5422006337038892704L;

    private List<E> content;

    private Page pageable;

    public List<E> getContent() {
        return content;
    }

    public void setContent(List<E> content) {
        this.content = content;
    }

    public Page getPageable() {
        return pageable;
    }

    public void setPageable(Page pageable) {
        this.pageable = pageable;
    }
}
