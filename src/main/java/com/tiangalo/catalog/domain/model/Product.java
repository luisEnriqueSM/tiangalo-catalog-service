package com.tiangalo.catalog.domain.model;

import com.tiangalo.catalog.domain.exception.DomainException;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Product {

    private final Long productId;
    private final String department;
    private final String category;
    private final String subCategory;
    private final String brand;
    private final String model;
    private final String ean13;
    private final String sku;
    private final BigDecimal priceMxn;
    private final BigDecimal costMxn;
    private final Integer stock;
    private final Seller seller;
    private final LocalDateTime activeFrom;
    private final LocalDateTime activeTo;
    private final String variantColor;
    private final String variantSize;
    private final String variantStorage;
    private final String variantAttr;
    
    public Product(Long productId, String department, String category, String subCategory, String brand, String model,
            String ean13, String sku, BigDecimal priceMxn, BigDecimal costMxn, Integer stock, Seller seller,
            LocalDateTime activeFrom, LocalDateTime activeTo, String variantColor, String variantSize,
            String variantStorage, String variantAttr) {
                if(priceMxn == null) throw new IllegalArgumentException("Precio requerido");
                if(costMxn == null)  throw new IllegalArgumentException("Costo requerido");
                if(model == null || model.isBlank())  throw new IllegalArgumentException("Modelo requerido");
                if(category == null || category.isBlank())  throw new IllegalArgumentException("Categoria requerida");
                if(department == null || department.isBlank())  throw new IllegalArgumentException("Departamento requerido");
                if(subCategory == null || subCategory.isBlank())  throw new IllegalArgumentException("SubCategoria requerida");
                if(brand == null || brand.isBlank())  throw new IllegalArgumentException("Branda requerida");
                
                this.productId = productId;
                this.department = department;
                this.category = category;
                this.subCategory = subCategory;
                this.brand = brand;
                this.model = model;
                this.ean13 = ean13;
                this.sku = sku;
                this.priceMxn = priceMxn;
                this.costMxn = costMxn;
                this.stock = stock;
                this.seller = seller;
                this.activeFrom = activeFrom;
                this.activeTo = activeTo;
                this.variantColor = variantColor;
                this.variantSize = variantSize;
                this.variantStorage = variantStorage;
                this.variantAttr = variantAttr;
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

    public String getEan13() {
        return ean13;
    }

    public String getSku() {
        return sku;
    }

    public BigDecimal getPriceMxn() {
        return priceMxn;
    }

    public BigDecimal getCostMxn() {
        return costMxn;
    }

    public Integer getStock() {
        return stock;
    }

    public Seller getSellerId() {
        return seller;
    }

    public LocalDateTime getActiveFrom() {
        return activeFrom;
    }

    public LocalDateTime getActiveTo() {
        return activeTo;
    }

    public String getVariantColor() {
        return variantColor;
    }

    public String getVariantSize() {
        return variantSize;
    }

    public String getVariantStorage() {
        return variantStorage;
    }

    public String getVariantAttr() {
        return variantAttr;
    }
}
