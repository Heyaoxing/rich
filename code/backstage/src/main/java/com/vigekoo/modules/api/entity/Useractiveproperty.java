package com.vigekoo.modules.api.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author blues
 * @Description: TODO(用户活跃属性)
 * @date 2018-04-09 11:17:00
 */
public class Useractiveproperty implements Serializable {
	
	//
	private String uapid;
	//
	private String userId;
	//
	private Integer renown;
	//
	private Integer praise;
	//
	private Date lastLogin;

	/**
	 * 设置：
	 */
	public void setUapid(String uapid) {
		this.uapid = uapid;
	}
	/**
	 * 获取：
	 */
	public String getUapid() {
		return uapid;
	}
	/**
	 * 设置：
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * 获取：
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * 设置：
	 */
	public void setRenown(Integer renown) {
		this.renown = renown;
	}
	/**
	 * 获取：
	 */
	public Integer getRenown() {
		return renown;
	}
	/**
	 * 设置：
	 */
	public void setPraise(Integer praise) {
		this.praise = praise;
	}
	/**
	 * 获取：
	 */
	public Integer getPraise() {
		return praise;
	}
	/**
	 * 设置：
	 */
	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	/**
	 * 获取：
	 */
	public Date getLastLogin() {
		return lastLogin;
	}

}
