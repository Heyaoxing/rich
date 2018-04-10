package com.vigekoo.modules.api.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author blues
 * @Description: TODO(管理人员表)
 * @date 2018-04-09 11:17:00
 */
public class Personinfo implements Serializable {
	
	//
	private Integer personId;
	//
	private String name;
	//
	private String mobile;
	//
	private Date createdon;

	/**
	 * 设置：
	 */
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	/**
	 * 获取：
	 */
	public Integer getPersonId() {
		return personId;
	}
	/**
	 * 设置：
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * 获取：
	 */
	public String getMobile() {
		return mobile;
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
