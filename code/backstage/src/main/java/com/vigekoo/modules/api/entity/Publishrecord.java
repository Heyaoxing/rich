package com.vigekoo.modules.api.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author blues
 * @Description: TODO(发布记录)
 * @date 2018-04-09 11:17:00
 */
public class Publishrecord implements Serializable {
	
	//
	private String publishId;
	//
	private String userId;
	//1:商品
//            2:服务
	private Integer publishType;
	//
	private String name;
	//
	private Integer startPrice;
	//
	private Integer endPrice;
	//
	private Integer sortId;
	//
	private String descript;
	//
	private String images01;
	//
	private String images02;
	//
	private String images03;
	//经度
	private String lng;
	//纬度
	private String lat;
	//
	private Date createdOn;
	//审核状态 0：未审核  1：审核通过  2：审核失败
	private Integer verifiedStatus;
	//
	private Integer personId;
	//
	private Date verifiedOn;
	//
	private String errorMessage;
	//
	private Date publishOn;
	//这个状态是后台系统设置
//            100:禁用
//            200:正常
            
	private Integer status;
	//是否删除 0:否  1:是
//            这个状态是用户设置
	private Integer isDelete;

	/**
	 * 设置：
	 */
	public void setPublishId(String publishId) {
		this.publishId = publishId;
	}
	/**
	 * 获取：
	 */
	public String getPublishId() {
		return publishId;
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
	 * 设置：1:商品
            2:服务
	 */
	public void setPublishType(Integer publishType) {
		this.publishType = publishType;
	}
	/**
	 * 获取：1:商品
            2:服务
	 */
	public Integer getPublishType() {
		return publishType;
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
	public void setStartPrice(Integer startPrice) {
		this.startPrice = startPrice;
	}
	/**
	 * 获取：
	 */
	public Integer getStartPrice() {
		return startPrice;
	}
	/**
	 * 设置：
	 */
	public void setEndPrice(Integer endPrice) {
		this.endPrice = endPrice;
	}
	/**
	 * 获取：
	 */
	public Integer getEndPrice() {
		return endPrice;
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
	/**
	 * 设置：
	 */
	public void setDescript(String descript) {
		this.descript = descript;
	}
	/**
	 * 获取：
	 */
	public String getDescript() {
		return descript;
	}
	/**
	 * 设置：
	 */
	public void setImages01(String images01) {
		this.images01 = images01;
	}
	/**
	 * 获取：
	 */
	public String getImages01() {
		return images01;
	}
	/**
	 * 设置：
	 */
	public void setImages02(String images02) {
		this.images02 = images02;
	}
	/**
	 * 获取：
	 */
	public String getImages02() {
		return images02;
	}
	/**
	 * 设置：
	 */
	public void setImages03(String images03) {
		this.images03 = images03;
	}
	/**
	 * 获取：
	 */
	public String getImages03() {
		return images03;
	}
	/**
	 * 设置：经度
	 */
	public void setLng(String lng) {
		this.lng = lng;
	}
	/**
	 * 获取：经度
	 */
	public String getLng() {
		return lng;
	}
	/**
	 * 设置：纬度
	 */
	public void setLat(String lat) {
		this.lat = lat;
	}
	/**
	 * 获取：纬度
	 */
	public String getLat() {
		return lat;
	}
	/**
	 * 设置：
	 */
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	/**
	 * 获取：
	 */
	public Date getCreatedOn() {
		return createdOn;
	}
	/**
	 * 设置：审核状态 0：未审核  1：审核通过  2：审核失败
	 */
	public void setVerifiedStatus(Integer verifiedStatus) {
		this.verifiedStatus = verifiedStatus;
	}
	/**
	 * 获取：审核状态 0：未审核  1：审核通过  2：审核失败
	 */
	public Integer getVerifiedStatus() {
		return verifiedStatus;
	}
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
	public void setVerifiedOn(Date verifiedOn) {
		this.verifiedOn = verifiedOn;
	}
	/**
	 * 获取：
	 */
	public Date getVerifiedOn() {
		return verifiedOn;
	}
	/**
	 * 设置：
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	/**
	 * 获取：
	 */
	public String getErrorMessage() {
		return errorMessage;
	}
	/**
	 * 设置：
	 */
	public void setPublishOn(Date publishOn) {
		this.publishOn = publishOn;
	}
	/**
	 * 获取：
	 */
	public Date getPublishOn() {
		return publishOn;
	}
	/**
	 * 设置：这个状态是后台系统设置
            100:禁用
            200:正常
            
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：这个状态是后台系统设置
            100:禁用
            200:正常
            
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：是否删除 0:否  1:是
            这个状态是用户设置
	 */
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	/**
	 * 获取：是否删除 0:否  1:是
            这个状态是用户设置
	 */
	public Integer getIsDelete() {
		return isDelete;
	}

}
