package com.tiangalo.catalog.domain.service;

import com.tiangalo.catalog.domain.model.Product;
import com.tiangalo.catalog.domain.repository.ProductRepository;

public class ProductDomainService {

    private final ProductRepository repository;

    public ProductDomainService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product createProduct(Product product){
        repository.findBySku(product.getSku()).ifPresent(g -> {throw new IllegalStateException("SKU ya existe");});
        return repository.save(product);
    }

}
