package com.vigekoo.modules.api.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author blues
 * @Description: TODO(行业类目表)
 * @date 2018-04-09 11:17:00
 */
public class Businesssortinfo implements Serializable {
	
	//
	private Integer sortId;
	//
	private String name;
	//
	private String iconUrl;
	//100:禁用
//            200:启用
	private Integer status;

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
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	/**
	 * 获取：
	 */
	public String getIconUrl() {
		return iconUrl;
	}
	/**
	 * 设置：100:禁用
            200:启用
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：100:禁用
            200:启用
	 */
	public Integer getStatus() {
		return status;
	}

}
