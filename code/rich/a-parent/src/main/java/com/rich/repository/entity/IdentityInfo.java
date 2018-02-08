package com.rich.repository.entity;

import java.io.Serializable;
import java.util.Date;

public class IdentityInfo implements Serializable {
    private String identityId;

    private String areaid;

    private String userId;

    private String name;

    private String briefly;

    private String address;

    private String workTime;

    private String mobile;

    private String images01;

    private String images02;

    private String images03;

    private String images04;

    private String images05;

    private String images06;

    private Date createdon;

    private Date updatedon;

    private String description;

    private static final long serialVersionUID = 1L;

    public String getIdentityId() {
        return identityId;
    }

    public void setIdentityId(String identityId) {
        this.identityId = identityId == null ? null : identityId.trim();
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid == null ? null : areaid.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getBriefly() {
        return briefly;
    }

    public void setBriefly(String briefly) {
        this.briefly = briefly == null ? null : briefly.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime == null ? null : workTime.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
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

    public String getImages04() {
        return images04;
    }

    public void setImages04(String images04) {
        this.images04 = images04 == null ? null : images04.trim();
    }

    public String getImages05() {
        return images05;
    }

    public void setImages05(String images05) {
        this.images05 = images05 == null ? null : images05.trim();
    }

    public String getImages06() {
        return images06;
    }

    public void setImages06(String images06) {
        this.images06 = images06 == null ? null : images06.trim();
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }

    public Date getUpdatedon() {
        return updatedon;
    }

    public void setUpdatedon(Date updatedon) {
        this.updatedon = updatedon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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
        IdentityInfo other = (IdentityInfo) that;
        return (this.getIdentityId() == null ? other.getIdentityId() == null : this.getIdentityId().equals(other.getIdentityId()))
            && (this.getAreaid() == null ? other.getAreaid() == null : this.getAreaid().equals(other.getAreaid()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getBriefly() == null ? other.getBriefly() == null : this.getBriefly().equals(other.getBriefly()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getWorkTime() == null ? other.getWorkTime() == null : this.getWorkTime().equals(other.getWorkTime()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getImages01() == null ? other.getImages01() == null : this.getImages01().equals(other.getImages01()))
            && (this.getImages02() == null ? other.getImages02() == null : this.getImages02().equals(other.getImages02()))
            && (this.getImages03() == null ? other.getImages03() == null : this.getImages03().equals(other.getImages03()))
            && (this.getImages04() == null ? other.getImages04() == null : this.getImages04().equals(other.getImages04()))
            && (this.getImages05() == null ? other.getImages05() == null : this.getImages05().equals(other.getImages05()))
            && (this.getImages06() == null ? other.getImages06() == null : this.getImages06().equals(other.getImages06()))
            && (this.getCreatedon() == null ? other.getCreatedon() == null : this.getCreatedon().equals(other.getCreatedon()))
            && (this.getUpdatedon() == null ? other.getUpdatedon() == null : this.getUpdatedon().equals(other.getUpdatedon()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode());
        result = prime * result + ((getAreaid() == null) ? 0 : getAreaid().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getBriefly() == null) ? 0 : getBriefly().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getWorkTime() == null) ? 0 : getWorkTime().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getImages01() == null) ? 0 : getImages01().hashCode());
        result = prime * result + ((getImages02() == null) ? 0 : getImages02().hashCode());
        result = prime * result + ((getImages03() == null) ? 0 : getImages03().hashCode());
        result = prime * result + ((getImages04() == null) ? 0 : getImages04().hashCode());
        result = prime * result + ((getImages05() == null) ? 0 : getImages05().hashCode());
        result = prime * result + ((getImages06() == null) ? 0 : getImages06().hashCode());
        result = prime * result + ((getCreatedon() == null) ? 0 : getCreatedon().hashCode());
        result = prime * result + ((getUpdatedon() == null) ? 0 : getUpdatedon().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", identityId=").append(identityId);
        sb.append(", areaid=").append(areaid);
        sb.append(", userId=").append(userId);
        sb.append(", name=").append(name);
        sb.append(", briefly=").append(briefly);
        sb.append(", address=").append(address);
        sb.append(", workTime=").append(workTime);
        sb.append(", mobile=").append(mobile);
        sb.append(", images01=").append(images01);
        sb.append(", images02=").append(images02);
        sb.append(", images03=").append(images03);
        sb.append(", images04=").append(images04);
        sb.append(", images05=").append(images05);
        sb.append(", images06=").append(images06);
        sb.append(", createdon=").append(createdon);
        sb.append(", updatedon=").append(updatedon);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}