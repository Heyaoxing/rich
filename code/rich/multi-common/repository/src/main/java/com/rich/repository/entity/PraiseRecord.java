package com.rich.repository.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PraiseRecord implements Serializable {
    private Integer praiseId;

    private String useriId;

    private String praiserUserid;

    private BigDecimal score;

    private String evaluation;

    private Integer agreeNumber;

    private Integer disagreeNumber;

    private Date createdon;

    private static final long serialVersionUID = 1L;

    public Integer getPraiseId() {
        return praiseId;
    }

    public void setPraiseId(Integer praiseId) {
        this.praiseId = praiseId;
    }

    public String getUseriId() {
        return useriId;
    }

    public void setUseriId(String useriId) {
        this.useriId = useriId == null ? null : useriId.trim();
    }

    public String getPraiserUserid() {
        return praiserUserid;
    }

    public void setPraiserUserid(String praiserUserid) {
        this.praiserUserid = praiserUserid == null ? null : praiserUserid.trim();
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation == null ? null : evaluation.trim();
    }

    public Integer getAgreeNumber() {
        return agreeNumber;
    }

    public void setAgreeNumber(Integer agreeNumber) {
        this.agreeNumber = agreeNumber;
    }

    public Integer getDisagreeNumber() {
        return disagreeNumber;
    }

    public void setDisagreeNumber(Integer disagreeNumber) {
        this.disagreeNumber = disagreeNumber;
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
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
        PraiseRecord other = (PraiseRecord) that;
        return (this.getPraiseId() == null ? other.getPraiseId() == null : this.getPraiseId().equals(other.getPraiseId()))
            && (this.getUseriId() == null ? other.getUseriId() == null : this.getUseriId().equals(other.getUseriId()))
            && (this.getPraiserUserid() == null ? other.getPraiserUserid() == null : this.getPraiserUserid().equals(other.getPraiserUserid()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getEvaluation() == null ? other.getEvaluation() == null : this.getEvaluation().equals(other.getEvaluation()))
            && (this.getAgreeNumber() == null ? other.getAgreeNumber() == null : this.getAgreeNumber().equals(other.getAgreeNumber()))
            && (this.getDisagreeNumber() == null ? other.getDisagreeNumber() == null : this.getDisagreeNumber().equals(other.getDisagreeNumber()))
            && (this.getCreatedon() == null ? other.getCreatedon() == null : this.getCreatedon().equals(other.getCreatedon()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPraiseId() == null) ? 0 : getPraiseId().hashCode());
        result = prime * result + ((getUseriId() == null) ? 0 : getUseriId().hashCode());
        result = prime * result + ((getPraiserUserid() == null) ? 0 : getPraiserUserid().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getEvaluation() == null) ? 0 : getEvaluation().hashCode());
        result = prime * result + ((getAgreeNumber() == null) ? 0 : getAgreeNumber().hashCode());
        result = prime * result + ((getDisagreeNumber() == null) ? 0 : getDisagreeNumber().hashCode());
        result = prime * result + ((getCreatedon() == null) ? 0 : getCreatedon().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", praiseId=").append(praiseId);
        sb.append(", useriId=").append(useriId);
        sb.append(", praiserUserid=").append(praiserUserid);
        sb.append(", score=").append(score);
        sb.append(", evaluation=").append(evaluation);
        sb.append(", agreeNumber=").append(agreeNumber);
        sb.append(", disagreeNumber=").append(disagreeNumber);
        sb.append(", createdon=").append(createdon);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}