package com.tiangalo.catalog.domain.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class ProductPriceHistory {
    private Long productId;
    private LocalDate date;
    private BigDecimal listPriceMxn;
    private BigDecimal promoPriceMxn;

    public ProductPriceHistory(Long productId, LocalDate date, BigDecimal listPriceMxn, BigDecimal promoPriceMxn) {
        this.productId = productId;
        this.date = date;
        this.listPriceMxn = listPriceMxn;
        this.promoPriceMxn = promoPriceMxn;
    }

    public Long getProductId(){ return productId; }
    public LocalDate getDate(){ return date; }
    public BigDecimal getListPriceMxn(){ return listPriceMxn; }
    public BigDecimal getPromoPriceMxn(){ return promoPriceMxn; }

    @Override public boolean equals(Object o){
        if(!(o instanceof ProductPriceHistory p)) return false;
        return Objects.equals(productId, p.productId) && Objects.equals(date, p.date);
    }
    @Override public int hashCode(){
        return Objects.hash(productId, date);
    }
}