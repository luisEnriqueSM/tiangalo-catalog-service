package com.tiangalo.catalog.infrastructure.persistence.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Table;
import jakarta.persistence.Index;

@Entity
@Table(
    name = "products",
    indexes = {
        @Index(name = "idx_products_cat", columnList = "department,category,subcategory"),
        @Index(name = "idx_products_brand", columnList = "brand"),
        @Index(name = "idx_products_seller", columnList = "seller_id")
    }
)
public class ProductEntity {

    @Id
    @Column(name = "product_id", nullable = false)
    private Long productId;

    @Column(name = "department", nullable = false, length = 50)
    private String department;

    @Column(name = "category", nullable = false, length = 50)
    private String category;

    @Column(name = "subcategory", nullable = false, length = 50)
    private String subcategory;

    @Column(name = "brand", nullable = false, length = 80)
    private String brand;

    @Column(name = "model", nullable = false, length = 120)
    private String model;

    @Column(name = "ean13", length = 13)
    private String ean13;

    @Column(name = "sku", length = 40)
    private String sku;

    @Column(name = "price_mxn", nullable = false, precision = 10, scale = 2)
    private BigDecimal priceMxn;

    @Column(name = "cost_mxn", nullable = false, precision = 10, scale = 2)
    private BigDecimal costMxn;

    @Column(name = "stock")
    private Long stock;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
        name = "seller_id",
        foreignKey = @ForeignKey(name = "fk_products_seller")
    )
    private SellerEntity seller;

    @Column(name = "active_from")
    private LocalDateTime activeFrom;

    @Column(name = "active_to")
    private LocalDateTime activeTo;

    @Column(name = "variant_color", length = 30)
    private String variantColor;

    @Column(name = "variant_size", length = 30)
    private String variantSize;

    @Column(name = "variant_storage", length = 30)
    private String variantStorage;

    @Column(name = "variant_attr", length = 30)
    private String variantAttr;

    public Long getProductId() { return productId; }
    public void setProductId(Long productId) { this.productId = productId; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getSubcategory() { return subcategory; }
    public void setSubcategory(String subcategory) { this.subcategory = subcategory; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getEan13() { return ean13; }
    public void setEan13(String ean13) { this.ean13 = ean13; }

    public String getSku() { return sku; }
    public void setSku(String sku) { this.sku = sku; }

    public BigDecimal getPriceMxn() { return priceMxn; }
    public void setPriceMxn(BigDecimal priceMxn) { this.priceMxn = priceMxn; }

    public BigDecimal getCostMxn() { return costMxn; }
    public void setCostMxn(BigDecimal costMxn) { this.costMxn = costMxn; }

    public Long getStock() { return stock; }
    public void setStock(Long stock) { this.stock = stock; }

    public SellerEntity getSeller() { return seller; }
    public void setSeller(SellerEntity seller) { this.seller = seller; }

    public LocalDateTime getActiveFrom() { return activeFrom; }
    public void setActiveFrom(LocalDateTime activeFrom) { this.activeFrom = activeFrom; }

    public LocalDateTime getActiveTo() { return activeTo; }
    public void setActiveTo(LocalDateTime activeTo) { this.activeTo = activeTo; }

    public String getVariantColor() { return variantColor; }
    public void setVariantColor(String variantColor) { this.variantColor = variantColor; }

    public String getVariantSize() { return variantSize; }
    public void setVariantSize(String variantSize) { this.variantSize = variantSize; }

    public String getVariantStorage() { return variantStorage; }
    public void setVariantStorage(String variantStorage) { this.variantStorage = variantStorage; }

    public String getVariantAttr() { return variantAttr; }
    public void setVariantAttr(String variantAttr) { this.variantAttr = variantAttr; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductEntity)) return false;
        ProductEntity other = (ProductEntity) o;
        return Objects.equals(productId, other.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }

    @Override
    public String toString() {
        return "Product{productId=" + productId + ", brand='" + brand + "', model='" + model + "'}";
    }
}