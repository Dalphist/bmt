package com.djf.bmt.project.system.product.entity;

/**
 * 商品实体类
 */
public class Product {
    private String id;
    private String bar_code;
    private String name;
    private String category_id;
    private Double stock_warn;
    private String unit;
    private String create_time;
    private String create_user;
    private String update_time;
    private String update_user;
    private String state;
    private String memo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBar_code() {
        return bar_code;
    }

    public void setBar_code(String bar_code) {
        this.bar_code = bar_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public Double getStock_warn() {
        return stock_warn;
    }

    public void setStock_warn(Double stock_warn) {
        this.stock_warn = stock_warn;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getCreate_user() {
        return create_user;
    }

    public void setCreate_user(String create_user) {
        this.create_user = create_user;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public String getUpdate_user() {
        return update_user;
    }

    public void setUpdate_user(String update_user) {
        this.update_user = update_user;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", bar_code='" + bar_code + '\'' +
                ", name='" + name + '\'' +
                ", category_id='" + category_id + '\'' +
                ", stock_warn=" + stock_warn +
                ", unit='" + unit + '\'' +
                ", create_time='" + create_time + '\'' +
                ", create_user='" + create_user + '\'' +
                ", update_time='" + update_time + '\'' +
                ", update_user='" + update_user + '\'' +
                ", state='" + state + '\'' +
                ", memo='" + memo + '\'' +
                '}';
    }
}
