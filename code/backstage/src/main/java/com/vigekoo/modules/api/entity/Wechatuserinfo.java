package com.vigekoo.modules.api.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author blues
 * @Description: TODO(微信用户信息表)
 * @date 2018-04-09 11:17:00
 */
public class Wechatuserinfo implements Serializable {
	
	//
	private String userId;
	//
	private String areaId;
	//
	private String openid;
	//
	private String unionid;
	//
	private String nickname;
	//
	private String avatarurl;
	//
	private String gender;
	//
	private String city;
	//
	private String province;
	//
	private String country;
	//
	private String language;
	//
	private Integer isEnabled;
	//
	private Integer activityCount;
	//
	private Integer businessCount;
	//
	private Date createdon;

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
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	/**
	 * 获取：
	 */
	public String getAreaId() {
		return areaId;
	}
	/**
	 * 设置：
	 */
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	/**
	 * 获取：
	 */
	public String getOpenid() {
		return openid;
	}
	/**
	 * 设置：
	 */
	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}
	/**
	 * 获取：
	 */
	public String getUnionid() {
		return unionid;
	}
	/**
	 * 设置：
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	 * 获取：
	 */
	public String getNickname() {
		return nickname;
	}
	/**
	 * 设置：
	 */
	public void setAvatarurl(String avatarurl) {
		this.avatarurl = avatarurl;
	}
	/**
	 * 获取：
	 */
	public String getAvatarurl() {
		return avatarurl;
	}
	/**
	 * 设置：
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * 获取：
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * 设置：
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * 获取：
	 */
	public String getCity() {
		return city;
	}
	/**
	 * 设置：
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * 获取：
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * 设置：
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * 获取：
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * 设置：
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	/**
	 * 获取：
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * 设置：
	 */
	public void setIsEnabled(Integer isEnabled) {
		this.isEnabled = isEnabled;
	}
	/**
	 * 获取：
	 */
	public Integer getIsEnabled() {
		return isEnabled;
	}
	/**
	 * 设置：
	 */
	public void setActivityCount(Integer activityCount) {
		this.activityCount = activityCount;
	}
	/**
	 * 获取：
	 */
	public Integer getActivityCount() {
		return activityCount;
	}
	/**
	 * 设置：
	 */
	public void setBusinessCount(Integer businessCount) {
		this.businessCount = businessCount;
	}
	/**
	 * 获取：
	 */
	public Integer getBusinessCount() {
		return businessCount;
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
