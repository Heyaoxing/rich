package com.rich.repository.entity;

import java.io.Serializable;
import java.util.Date;

public class publishRecord implements Serializable {
    private Integer publishId;

    private String userId;

    private Integer sortId;

    private Integer personId;

    private Short publishType;

    private String content;

    private String images01;

    private String images02;

    private String images03;

    private Date createdon;

    private Date verifiedon;

    private String errorMessage;

    private Date publishon;

    private Short status;

    private static final long serialVersionUID = 1L;

    public Integer getPublishId() {
        return publishId;
    }

    public void setPublishId(Integer publishId) {
        this.publishId = publishId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Short getPublishType() {
        return publishType;
    }

    public void setPublishType(Short publishType) {
        this.publishType = publishType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getImages01() {
        return images01;
    }

    public void setImages01(String images01) {
        this.images01 = images01 == null ? null : images01.trim();
    }

    public String getImages02() {
        return images02;
    }

    public void setImages02(String images02) {
        this.images02 = images02 == null ? null : images02.trim();
    }

    public String getImages03() {
        return images03;
    }

    public void setImages03(String images03) {
        this.images03 = images03 == null ? null : images03.trim();
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }

    public Date getVerifiedon() {
        return verifiedon;
    }

    public void setVerifiedon(Date verifiedon) {
        this.verifiedon = verifiedon;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage == null ? null : errorMessage.trim();
    }

    public Date getPublishon() {
        return publishon;
    }

    public void setPublishon(Date publishon) {
        this.publishon = publishon;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        publishRecord other = (publishRecord) that;
        return (this.getPublishId() == null ? other.getPublishId() == null : this.getPublishId().equals(other.getPublishId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getSortId() == null ? other.getSortId() == null : this.getSortId().equals(other.getSortId()))
            && (this.getPersonId() == null ? other.getPersonId() == null : this.getPersonId().equals(other.getPersonId()))
            && (this.getPublishType() == null ? other.getPublishType() == null : this.getPublishType().equals(other.getPublishType()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getImages01() == null ? other.getImages01() == null : this.getImages01().equals(other.getImages01()))
            && (this.getImages02() == null ? other.getImages02() == null : this.getImages02().equals(other.getImages02()))
            && (this.getImages03() == null ? other.getImages03() == null : this.getImages03().equals(other.getImages03()))
            && (this.getCreatedon() == null ? other.getCreatedon() == null : this.getCreatedon().equals(other.getCreatedon()))
            && (this.getVerifiedon() == null ? other.getVerifiedon() == null : this.getVerifiedon().equals(other.getVerifiedon()))
            && (this.getErrorMessage() == null ? other.getErrorMessage() == null : this.getErrorMessage().equals(other.getErrorMessage()))
            && (this.getPublishon() == null ? other.getPublishon() == null : this.getPublishon().equals(other.getPublishon()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPublishId() == null) ? 0 : getPublishId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getSortId() == null) ? 0 : getSortId().hashCode());
        result = prime * result + ((getPersonId() == null) ? 0 : getPersonId().hashCode());
        result = prime * result + ((getPublishType() == null) ? 0 : getPublishType().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getImages01() == null) ? 0 : getImages01().hashCode());
        result = prime * result + ((getImages02() == null) ? 0 : getImages02().hashCode());
        result = prime * result + ((getImages03() == null) ? 0 : getImages03().hashCode());
        result = prime * result + ((getCreatedon() == null) ? 0 : getCreatedon().hashCode());
        result = prime * result + ((getVerifiedon() == null) ? 0 : getVerifiedon().hashCode());
        result = prime * result + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        result = prime * result + ((getPublishon() == null) ? 0 : getPublishon().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", publishId=").append(publishId);
        sb.append(", userId=").append(userId);
        sb.append(", sortId=").append(sortId);
        sb.append(", personId=").append(personId);
        sb.append(", publishType=").append(publishType);
        sb.append(", content=").append(content);
        sb.append(", images01=").append(images01);
        sb.append(", images02=").append(images02);
        sb.append(", images03=").append(images03);
        sb.append(", createdon=").append(createdon);
        sb.append(", verifiedon=").append(verifiedon);
        sb.append(", errorMessage=").append(errorMessage);
        sb.append(", publishon=").append(publishon);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}