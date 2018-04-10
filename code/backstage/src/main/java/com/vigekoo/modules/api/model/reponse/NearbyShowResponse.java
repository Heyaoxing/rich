package com.vigekoo.modules.api.model.reponse;

import com.vigekoo.common.utils.DateUtils;
import lombok.Data;

import java.util.Date;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/4/9 11:10
 */
public class NearbyShowResponse {
    private String userId;
    private String userName;
    /**
     * @description:用户头像
     * @author 990016
     * @date 2018/4/9 11:12
     */
    private String avatarUrl;
    /**
     * @description:好评率
     * @author 990016
     * @date 2018/4/9 11:12
     */
    private Integer praise;

    private String publishId;
    /**
     * @description:发布类别
     * @author 990016
     * @date 2018/4/9 11:22
     */
    private int publishType;

    /**
     * @description:产品名称
     * @author 990016
     * @date 2018/4/9 11:22
     */
    private String name;

    /**
     * @description:开始价格
     * @author 990016
     * @date 2018/4/9 11:23
     */
    private int startPrice;

    /**
     * @description:结束价格
     * @author 990016
     * @date 2018/4/9 11:23
     */
    private int endPrice;

    /**
     * @description:距离
     * @author 990016
     * @date 2018/4/9 11:24
     */
    private Integer distance;

    /**
     * @description:发布时间
     * @author 990016
     * @date 2018/4/9 11:24
     */
    private Date publishOn;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Integer getPraise() {
        return praise;
    }

    public void setPraise(Integer praise) {
        this.praise = praise;
    }

    public String getPublishId() {
        return publishId;
    }

    public void setPublishId(String publishId) {
        this.publishId = publishId;
    }

    public int getPublishType() {
        return publishType;
    }

    public void setPublishType(int publishType) {
        this.publishType = publishType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(int startPrice) {
        this.startPrice = startPrice;
    }

    public int getEndPrice() {
        return endPrice;
    }

    public void setEndPrice(int endPrice) {
        this.endPrice = endPrice;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Date getPublishOn() {
        return publishOn;
    }

    public void setPublishOn(Date publishOn) {
        this.publishOn = publishOn;
    }

    /**
     * @description:发布时间字符格式
     * @author 990016
     * @date 2018/4/9 11:25
     */
    private String publicOnString;

    public String getPublicOnString() {
        if (this.publishOn == null) {
            return "";
        }
        return DateUtils.getDayDiffToString(this.publishOn);
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    private String lng;
    private String lat;

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
