package com.tiangalo.catalog.domain.repository;

import java.util.List;
import java.util.Optional;

import com.tiangalo.catalog.domain.model.Product;

public interface ProductRepository {
    Optional<Product> findBySku(String sku);
    Optional<Product> findById(Long id);
    Product save(Product product);
    void deleteById(Long id);
    List<Product> findAll();
}
