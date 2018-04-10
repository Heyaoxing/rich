package com.vigekoo.modules.api.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author blues
 * @Description: TODO(平台配置表)
 * @date 2018-04-09 11:17:00
 */
public class Platformconfig implements Serializable {
	
	//
	private Integer platformConfigId;
	//
	private Integer everyActivityNum;
	//
	private Integer everyBusinessNum;
	//
	private Integer maxActivityNum;
	//
	private Integer maxBusinessNum;

	/**
	 * 设置：
	 */
	public void setPlatformConfigId(Integer platformConfigId) {
		this.platformConfigId = platformConfigId;
	}
	/**
	 * 获取：
	 */
	public Integer getPlatformConfigId() {
		return platformConfigId;
	}
	/**
	 * 设置：
	 */
	public void setEveryActivityNum(Integer everyActivityNum) {
		this.everyActivityNum = everyActivityNum;
	}
	/**
	 * 获取：
	 */
	public Integer getEveryActivityNum() {
		return everyActivityNum;
	}
	/**
	 * 设置：
	 */
	public void setEveryBusinessNum(Integer everyBusinessNum) {
		this.everyBusinessNum = everyBusinessNum;
	}
	/**
	 * 获取：
	 */
	public Integer getEveryBusinessNum() {
		return everyBusinessNum;
	}
	/**
	 * 设置：
	 */
	public void setMaxActivityNum(Integer maxActivityNum) {
		this.maxActivityNum = maxActivityNum;
	}
	/**
	 * 获取：
	 */
	public Integer getMaxActivityNum() {
		return maxActivityNum;
	}
	/**
	 * 设置：
	 */
	public void setMaxBusinessNum(Integer maxBusinessNum) {
		this.maxBusinessNum = maxBusinessNum;
	}
	/**
	 * 获取：
	 */
	public Integer getMaxBusinessNum() {
		return maxBusinessNum;
	}

}
