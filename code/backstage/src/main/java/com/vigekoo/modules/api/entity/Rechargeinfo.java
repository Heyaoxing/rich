package com.vigekoo.modules.api.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author blues
 * @Description: TODO(充值记录表)
 * @date 2018-04-09 11:17:00
 */
public class Rechargeinfo implements Serializable {
	
	//
	private String rechargeId;
	//
	private String userId;
	//
	private Integer money;
	//1:微信
//            2:支付宝
//            3:现金
//            4:银行转账
	private Integer source;
	//
	private String account;
	//
	private Date createdon;

	/**
	 * 设置：
	 */
	public void setRechargeId(String rechargeId) {
		this.rechargeId = rechargeId;
	}
	/**
	 * 获取：
	 */
	public String getRechargeId() {
		return rechargeId;
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
	public void setMoney(Integer money) {
		this.money = money;
	}
	/**
	 * 获取：
	 */
	public Integer getMoney() {
		return money;
	}
	/**
	 * 设置：1:微信
            2:支付宝
            3:现金
            4:银行转账
	 */
	public void setSource(Integer source) {
		this.source = source;
	}
	/**
	 * 获取：1:微信
            2:支付宝
            3:现金
            4:银行转账
	 */
	public Integer getSource() {
		return source;
	}
	/**
	 * 设置：
	 */
	public void setAccount(String account) {
		this.account = account;
	}
	/**
	 * 获取：
	 */
	public String getAccount() {
		return account;
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
