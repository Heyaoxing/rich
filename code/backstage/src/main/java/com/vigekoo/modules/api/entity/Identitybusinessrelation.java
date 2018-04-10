package com.vigekoo.modules.api.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author blues
 * @Description: TODO(职业名片关系对应表)
 * @date 2018-04-09 11:17:00
 */
public class Identitybusinessrelation implements Serializable {
	
	//
	private String id;
	//
	private String identityId;
	//
	private Integer sortId;

	/**
	 * 设置：
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setIdentityId(String identityId) {
		this.identityId = identityId;
	}
	/**
	 * 获取：
	 */
	public String getIdentityId() {
		return identityId;
	}
	/**
	 * 设置：
	 */
	public void setSortId(Integer sortId) {
		this.sortId = sortId;
	}
	/**
	 * 获取：
	 */
	public Integer getSortId() {
		return sortId;
	}

}
