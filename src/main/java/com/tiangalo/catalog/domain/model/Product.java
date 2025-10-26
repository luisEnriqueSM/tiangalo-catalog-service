package com.tiangalo.catalog.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Product {

    private final Long productId;
    private final String department;
    private final String category;
    private final String subCategory;
    private final String brand;
    private final String model;
    private final String en13;
    private final String sku;
    private final BigDecimal price_mxn;
    private final BigDecimal cost_mxn;
    private final Long stock;
    private final Seller seller_id;
    private final LocalDateTime active_from;
    private final LocalDateTime active_to;
    private final String variant_color;
    private final String variant_size;
    private final String variant_storage;
    private final String variant_attr;
    
    public Product(Long productId, String department, String category, String subCategory, String brand, String model,
            String en13, String sku, BigDecimal price_mxn, BigDecimal cost_mxn, Long stock, Seller seller_id,
            LocalDateTime active_from, LocalDateTime active_to, String variant_color, String variant_size,
            String variant_storage, String variant_attr) {
                if(price_mxn == null) throw new IllegalArgumentException("Precio requerido");
                if(cost_mxn == null)  throw new IllegalArgumentException("Costo requerido");
                if(model == null || model.isBlank())  throw new IllegalArgumentException("Modelo requerido");
                if(category == null || category.isBlank())  throw new IllegalArgumentException("Categoria requerida");
                if(department == null || department.isBlank())  throw new IllegalArgumentException("Departamento requerido");
                if(subCategory == null || subCategory.isBlank())  throw new IllegalArgumentException("SubCategoria requerida");
                if(brand == null || brand.isBlank())  throw new IllegalArgumentException("Banda requerida");
                
                this.productId = productId;
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

    public Long getProductId() {
        return productId;
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
