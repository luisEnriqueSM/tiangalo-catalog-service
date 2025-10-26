package com.tiangalo.catalog.infrastructure.persistence.mapper;

import com.tiangalo.catalog.domain.model.Product;
import com.tiangalo.catalog.domain.model.Seller;
import com.tiangalo.catalog.infrastructure.persistence.entity.ProductEntity;
import com.tiangalo.catalog.infrastructure.persistence.entity.SellerEntity;

public class ProductEntityMapper {

    public static Seller toDomain(SellerEntity e){
        if(e == null) return null;
        return new Seller(
            e.getSellerId(),
            e.getName(),
            e.getState(),
            e.getRating()
        );
    }

    public static SellerEntity toEntity(Seller d){
        if(d == null) return null;
        SellerEntity e = new SellerEntity();
        e.setSellerId(d.getSellerId());
        e.setName(d.getName());
        e.setState(d.getState());
        e.setRating(e.getRating());
        return e;
    }
    
    public static Product toDomain(ProductEntity e){
        if(e == null) return null;
        return new Product(
            e.getProductId(),
            e.getDepartment(),
            e.getCategory(),
            e.getSubcategory(),
            e.getBrand(),
            e.getModel(),
            e.getEan13(),
            e.getSku(),
            e.getPriceMxn(),
            e.getCostMxn(),
            e.getStock(),
            toDomain(e.getSeller()),
            e.getActiveFrom(),
            e.getActiveTo(),
            e.getVariantColor(),
            e.getVariantSize(),
            e.getVariantStorage(),
            e.getVariantAttr()
        );
    }

    public static ProductEntity toEntity(Product domain, Seller seller){
        ProductEntity entity = new ProductEntity();
        entity.setProductId(domain.getProductId());
        entity.setDepartment(domain.getDepartment());
        entity.setCategory(domain.getCategory());
        entity.setSubcategory(domain.getSubCategory());
        entity.setBrand(domain.getBrand());
        entity.setModel(domain.getModel());
        entity.setEan13(domain.getEn13());
        entity.setSku(domain.getSku());
        entity.setPriceMxn(domain.getPrice_mxn());
        entity.setCostMxn(domain.getCost_mxn());
        entity.setStock(domain.getStock());
        entity.setSeller(toEntity(seller));
        entity.setActiveFrom(domain.getActive_from());
        entity.setActiveTo(domain.getActive_to());
        entity.setVariantColor(domain.getVariant_color());
        entity.setVariantSize(domain.getVariant_size());
        entity.setVariantStorage(domain.getVariant_storage());
        entity.setVariantAttr(domain.getVariant_attr());
        return entity;
    }
}
