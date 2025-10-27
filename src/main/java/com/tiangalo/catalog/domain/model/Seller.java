package com.tiangalo.catalog.domain.model;

import java.math.BigDecimal;

public class Seller {

    private final Integer sellerId;
    private final String name;
    private final String state;
    private final BigDecimal rating;

    public Seller(Integer sellerId, String name, String state, BigDecimal rating) {
        if(name == null || name.isBlank()) throw new IllegalArgumentException("Nombre requerido");
        this.sellerId = sellerId;
        this.name = name;
        this.state = state;
        this.rating = rating;
    }

    public Integer getSellerId() {
        return sellerId;
    }


    public String getName() {
        return name;
    }


    public String getState() {
        return state;
    }


    public BigDecimal getRating() {
        return rating;
    }

    

}
