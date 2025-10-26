package com.tiangalo.catalog.api.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.tiangalo.catalog.domain.model.Seller;

public class ProductResponse {

    private Long id;
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

    public ProductResponse(Long id, String department, String category, String subCategory, String brand, String model,
            String en13, String sku, BigDecimal price_mxn, BigDecimal cost_mxn, Long stock, Seller seller_id,
            LocalDateTime active_from, LocalDateTime active_to, String variant_color, String variant_size,
            String variant_storage, String variant_attr) {
        this.id = id;
        this.department = department;
        this.category = category;
        this.subCategory = subCategory;
        this.brand = brand;
        this.model = model;
        this.en13 = en13;
        this.sku = sku;
        this.price_mxn = price_mxn;
        this.cost_mxn = cost_mxn;
        this.stock = stock;
        this.seller_id = seller_id;
        this.active_from = active_from;
        this.active_to = active_to;
        this.variant_color = variant_color;
        this.variant_size = variant_size;
        this.variant_storage = variant_storage;
        this.variant_attr = variant_attr;
    }

    public Long getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public String getCategory() {
        return category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getEn13() {
        return en13;
    }

    public String getSku() {
        return sku;
    }

    public BigDecimal getPrice_mxn() {
        return price_mxn;
    }

    public BigDecimal getCost_mxn() {
        return cost_mxn;
    }

    public Long getStock() {
        return stock;
    }

    public Seller getSeller_id() {
        return seller_id;
    }

    public LocalDateTime getActive_from() {
        return active_from;
    }

    public LocalDateTime getActive_to() {
        return active_to;
    }

    public String getVariant_color() {
        return variant_color;
    }

    public String getVariant_size() {
        return variant_size;
    }

    public String getVariant_storage() {
        return variant_storage;
    }

    public String getVariant_attr() {
        return variant_attr;
    }

    
    
}
