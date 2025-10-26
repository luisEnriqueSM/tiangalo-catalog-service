package com.tiangalo.catalog.api.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.tiangalo.catalog.domain.model.Seller;

public class ProductRequest {

    private String department;
    private String category;
    private String subCategory;
    private String brand;
    private String model;
    private String en13;
    private String sku;
    private BigDecimal price_mxn;
    private BigDecimal cost_mxn;
    private Long stock;
    private Seller seller_id;
    private LocalDateTime active_from;
    private LocalDateTime active_to;
    private String variant_color;
    private String variant_size;
    private String variant_storage;
    private String variant_attr;
    
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getSubCategory() {
        return subCategory;
    }
    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getEn13() {
        return en13;
    }
    public void setEn13(String en13) {
        this.en13 = en13;
    }
    public String getSku() {
        return sku;
    }
    public void setSku(String sku) {
        this.sku = sku;
    }
    public BigDecimal getPrice_mxn() {
        return price_mxn;
    }
    public void setPrice_mxn(BigDecimal price_mxn) {
        this.price_mxn = price_mxn;
    }
    public BigDecimal getCost_mxn() {
        return cost_mxn;
    }
    public void setCost_mxn(BigDecimal cost_mxn) {
        this.cost_mxn = cost_mxn;
    }
    public Long getStock() {
        return stock;
    }
    public void setStock(Long stock) {
        this.stock = stock;
    }
    public Seller getSeller_id() {
        return seller_id;
    }
    public void setSeller_id(Seller seller_id) {
        this.seller_id = seller_id;
    }
    public LocalDateTime getActive_from() {
        return active_from;
    }
    public void setActive_from(LocalDateTime active_from) {
        this.active_from = active_from;
    }
    public LocalDateTime getActive_to() {
        return active_to;
    }
    public void setActive_to(LocalDateTime active_to) {
        this.active_to = active_to;
    }
    public String getVariant_color() {
        return variant_color;
    }
    public void setVariant_color(String variant_color) {
        this.variant_color = variant_color;
    }
    public String getVariant_size() {
        return variant_size;
    }
    public void setVariant_size(String variant_size) {
        this.variant_size = variant_size;
    }
    public String getVariant_storage() {
        return variant_storage;
    }
    public void setVariant_storage(String variant_storage) {
        this.variant_storage = variant_storage;
    }
    public String getVariant_attr() {
        return variant_attr;
    }
    public void setVariant_attr(String variant_attr) {
        this.variant_attr = variant_attr;
    }

    
}
