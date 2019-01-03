package com.djf.bmt.project.system.product.entity;

import java.math.BigDecimal;
import java.util.Date;

public class SalesOrder {
    private String id;

    private BigDecimal productPrice;

    private BigDecimal transportFare;

    private BigDecimal extraPrice;

    private BigDecimal totalPrice;

    private String payType;

    private Date createTime;

    private String createUser;

    private Date updateTime;

    private String updateUser;

    private String state;

    private String memo;

    private Date dealDate;

    private String taobaoCode;

    private Integer customerName;

    private String customerTel;

    private String customerPostcode;

    private Integer customerDistrict1Id;

    private Integer customerDistrict2Id;

    private Integer customerDistrict3Id;

    private String customerAddress;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public BigDecimal getTransportFare() {
        return transportFare;
    }

    public void setTransportFare(BigDecimal transportFare) {
        this.transportFare = transportFare;
    }

    public BigDecimal getExtraPrice() {
        return extraPrice;
    }

    public void setExtraPrice(BigDecimal extraPrice) {
        this.extraPrice = extraPrice;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Date getDealDate() {
        return dealDate;
    }

    public void setDealDate(Date dealDate) {
        this.dealDate = dealDate;
    }

    public String getTaobaoCode() {
        return taobaoCode;
    }

    public void setTaobaoCode(String taobaoCode) {
        this.taobaoCode = taobaoCode == null ? null : taobaoCode.trim();
    }

    public Integer getCustomerName() {
        return customerName;
    }

    public void setCustomerName(Integer customerName) {
        this.customerName = customerName;
    }

    public String getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(String customerTel) {
        this.customerTel = customerTel == null ? null : customerTel.trim();
    }

    public String getCustomerPostcode() {
        return customerPostcode;
    }

    public void setCustomerPostcode(String customerPostcode) {
        this.customerPostcode = customerPostcode == null ? null : customerPostcode.trim();
    }

    public Integer getCustomerDistrict1Id() {
        return customerDistrict1Id;
    }

    public void setCustomerDistrict1Id(Integer customerDistrict1Id) {
        this.customerDistrict1Id = customerDistrict1Id;
    }

    public Integer getCustomerDistrict2Id() {
        return customerDistrict2Id;
    }

    public void setCustomerDistrict2Id(Integer customerDistrict2Id) {
        this.customerDistrict2Id = customerDistrict2Id;
    }

    public Integer getCustomerDistrict3Id() {
        return customerDistrict3Id;
    }

    public void setCustomerDistrict3Id(Integer customerDistrict3Id) {
        this.customerDistrict3Id = customerDistrict3Id;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress == null ? null : customerAddress.trim();
    }
}