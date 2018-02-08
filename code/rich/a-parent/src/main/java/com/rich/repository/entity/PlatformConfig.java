package com.rich.repository.entity;

import java.io.Serializable;

public class PlatformConfig implements Serializable {
    private Integer platformConfigId;

    private Integer everyActivityNum;

    private Integer everyBusinessNum;

    private Integer maxActivityNum;

    private Integer maxBusinessNum;

    private static final long serialVersionUID = 1L;

    public Integer getPlatformConfigId() {
        return platformConfigId;
    }

    public void setPlatformConfigId(Integer platformConfigId) {
        this.platformConfigId = platformConfigId;
    }

    public Integer getEveryActivityNum() {
        return everyActivityNum;
    }

    public void setEveryActivityNum(Integer everyActivityNum) {
        this.everyActivityNum = everyActivityNum;
    }

    public Integer getEveryBusinessNum() {
        return everyBusinessNum;
    }

    public void setEveryBusinessNum(Integer everyBusinessNum) {
        this.everyBusinessNum = everyBusinessNum;
    }

    public Integer getMaxActivityNum() {
        return maxActivityNum;
    }

    public void setMaxActivityNum(Integer maxActivityNum) {
        this.maxActivityNum = maxActivityNum;
    }

    public Integer getMaxBusinessNum() {
        return maxBusinessNum;
    }

    public void setMaxBusinessNum(Integer maxBusinessNum) {
        this.maxBusinessNum = maxBusinessNum;
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
        PlatformConfig other = (PlatformConfig) that;
        return (this.getPlatformConfigId() == null ? other.getPlatformConfigId() == null : this.getPlatformConfigId().equals(other.getPlatformConfigId()))
            && (this.getEveryActivityNum() == null ? other.getEveryActivityNum() == null : this.getEveryActivityNum().equals(other.getEveryActivityNum()))
            && (this.getEveryBusinessNum() == null ? other.getEveryBusinessNum() == null : this.getEveryBusinessNum().equals(other.getEveryBusinessNum()))
            && (this.getMaxActivityNum() == null ? other.getMaxActivityNum() == null : this.getMaxActivityNum().equals(other.getMaxActivityNum()))
            && (this.getMaxBusinessNum() == null ? other.getMaxBusinessNum() == null : this.getMaxBusinessNum().equals(other.getMaxBusinessNum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPlatformConfigId() == null) ? 0 : getPlatformConfigId().hashCode());
        result = prime * result + ((getEveryActivityNum() == null) ? 0 : getEveryActivityNum().hashCode());
        result = prime * result + ((getEveryBusinessNum() == null) ? 0 : getEveryBusinessNum().hashCode());
        result = prime * result + ((getMaxActivityNum() == null) ? 0 : getMaxActivityNum().hashCode());
        result = prime * result + ((getMaxBusinessNum() == null) ? 0 : getMaxBusinessNum().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", platformConfigId=").append(platformConfigId);
        sb.append(", everyActivityNum=").append(everyActivityNum);
        sb.append(", everyBusinessNum=").append(everyBusinessNum);
        sb.append(", maxActivityNum=").append(maxActivityNum);
        sb.append(", maxBusinessNum=").append(maxBusinessNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}