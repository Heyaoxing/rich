package com.rich.repository.entity;

import java.io.Serializable;
import java.util.Date;

public class UserActiveProperty implements Serializable {
    private String uapid;

    private String userId;

    private Integer renown;

    private Integer praise;

    private Date lastLogin;

    private static final long serialVersionUID = 1L;

    public String getUapid() {
        return uapid;
    }

    public void setUapid(String uapid) {
        this.uapid = uapid == null ? null : uapid.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getRenown() {
        return renown;
    }

    public void setRenown(Integer renown) {
        this.renown = renown;
    }

    public Integer getPraise() {
        return praise;
    }

    public void setPraise(Integer praise) {
        this.praise = praise;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
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
        UserActiveProperty other = (UserActiveProperty) that;
        return (this.getUapid() == null ? other.getUapid() == null : this.getUapid().equals(other.getUapid()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getRenown() == null ? other.getRenown() == null : this.getRenown().equals(other.getRenown()))
            && (this.getPraise() == null ? other.getPraise() == null : this.getPraise().equals(other.getPraise()))
            && (this.getLastLogin() == null ? other.getLastLogin() == null : this.getLastLogin().equals(other.getLastLogin()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUapid() == null) ? 0 : getUapid().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getRenown() == null) ? 0 : getRenown().hashCode());
        result = prime * result + ((getPraise() == null) ? 0 : getPraise().hashCode());
        result = prime * result + ((getLastLogin() == null) ? 0 : getLastLogin().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uapid=").append(uapid);
        sb.append(", userId=").append(userId);
        sb.append(", renown=").append(renown);
        sb.append(", praise=").append(praise);
        sb.append(", lastLogin=").append(lastLogin);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}