package com.vigekoo.modules.api.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author blues
 * @Description: TODO(口碑评价记录)
 * @date 2018-04-09 11:17:00
 */
public class Praiserecord implements Serializable {
	
	//
	private String praiseId;
	//
	private String useriId;
	//
	private String praiserUserid;
	//
	private Integer score;
	//
	private String evaluation;
	//
	private Integer agreeNumber;
	//
	private Integer disagreeNumber;
	//
	private Date createdon;

	/**
	 * 设置：
	 */
	public void setPraiseId(String praiseId) {
		this.praiseId = praiseId;
	}
	/**
	 * 获取：
	 */
	public String getPraiseId() {
		return praiseId;
	}
	/**
	 * 设置：
	 */
	public void setUseriId(String useriId) {
		this.useriId = useriId;
	}
	/**
	 * 获取：
	 */
	public String getUseriId() {
		return useriId;
	}
	/**
	 * 设置：
	 */
	public void setPraiserUserid(String praiserUserid) {
		this.praiserUserid = praiserUserid;
	}
	/**
	 * 获取：
	 */
	public String getPraiserUserid() {
		return praiserUserid;
	}
	/**
	 * 设置：
	 */
	public void setScore(Integer score) {
		this.score = score;
	}
	/**
	 * 获取：
	 */
	public Integer getScore() {
		return score;
	}
	/**
	 * 设置：
	 */
	public void setEvaluation(String evaluation) {
		this.evaluation = evaluation;
	}
	/**
	 * 获取：
	 */
	public String getEvaluation() {
		return evaluation;
	}
	/**
	 * 设置：
	 */
	public void setAgreeNumber(Integer agreeNumber) {
		this.agreeNumber = agreeNumber;
	}
	/**
	 * 获取：
	 */
	public Integer getAgreeNumber() {
		return agreeNumber;
	}
	/**
	 * 设置：
	 */
	public void setDisagreeNumber(Integer disagreeNumber) {
		this.disagreeNumber = disagreeNumber;
	}
	/**
	 * 获取：
	 */
	public Integer getDisagreeNumber() {
		return disagreeNumber;
	}
	/**
	 * 设置：
	 */
	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}
	/**
	 * 获取：
	 */
	public Date getCreatedon() {
		return createdon;
	}

}
