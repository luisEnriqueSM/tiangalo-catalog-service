package com.tiangalo.catalog.infrastructure.persistence.entity;

import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sellers")
public class SellerEntity {

    @Id
    @Column(name = "seller_id", nullable = false)
    private Integer sellerId;

    @Column(name = "name", nullable = false, length = 120)
    private String name;

    @Column(name = "rating", precision = 3, scale = 2)
    private BigDecimal rating;

    @Column(name = "state", length = 30)
    private String state;

    public Integer getSellerId() { return sellerId; }
    public void setSellerId(Integer sellerId) { this.sellerId = sellerId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public BigDecimal getRating() { return rating; }
    public void setRating(BigDecimal rating) { this.rating = rating; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SellerEntity)) return false;
        SellerEntity other = (SellerEntity) o;
        return Objects.equals(sellerId, other.sellerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sellerId);
    }

    @Override
    public String toString() {
        return "Seller{sellerId=" + sellerId + ", name='" + name + "'}";
    }
}