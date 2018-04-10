package com.vigekoo.modules.api.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author blues
 * @Description: TODO(全国地理位置信息表 )
 * @date 2018-04-09 11:17:00
 */
public class Chinaareainfo implements Serializable {
	
	//
	private String areaid;
	//名称
	private String name;
	//父级id
	private String parentid;
	//简称
	private String shortname;
	//层级
	private Integer leveltype;
	//城市代码
	private String citycode;
	//邮编
	private String zipcode;
	//完整地区名称
	private String mergername;
	//经度
	private String lng;
	//纬度
	private String lat;
	//拼音
	private String pinyin;

	/**
	 * 设置：
	 */
	public void setAreaid(String areaid) {
		this.areaid = areaid;
	}
	/**
	 * 获取：
	 */
	public String getAreaid() {
		return areaid;
	}
	/**
	 * 设置：名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：父级id
	 */
	public void setParentid(String parentid) {
		this.parentid = parentid;
	}
	/**
	 * 获取：父级id
	 */
	public String getParentid() {
		return parentid;
	}
	/**
	 * 设置：简称
	 */
	public void setShortname(String shortname) {
		this.shortname = shortname;
	}
	/**
	 * 获取：简称
	 */
	public String getShortname() {
		return shortname;
	}
	/**
	 * 设置：层级
	 */
	public void setLeveltype(Integer leveltype) {
		this.leveltype = leveltype;
	}
	/**
	 * 获取：层级
	 */
	public Integer getLeveltype() {
		return leveltype;
	}
	/**
	 * 设置：城市代码
	 */
	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}
	/**
	 * 获取：城市代码
	 */
	public String getCitycode() {
		return citycode;
	}
	/**
	 * 设置：邮编
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	/**
	 * 获取：邮编
	 */
	public String getZipcode() {
		return zipcode;
	}
	/**
	 * 设置：完整地区名称
	 */
	public void setMergername(String mergername) {
		this.mergername = mergername;
	}
	/**
	 * 获取：完整地区名称
	 */
	public String getMergername() {
		return mergername;
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
	 * 设置：拼音
	 */
	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}
	/**
	 * 获取：拼音
	 */
	public String getPinyin() {
		return pinyin;
	}

}
