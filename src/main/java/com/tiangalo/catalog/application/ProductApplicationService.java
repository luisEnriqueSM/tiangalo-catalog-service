package com.tiangalo.catalog.application;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tiangalo.catalog.domain.model.Product;
import com.tiangalo.catalog.domain.repository.ProductRepository;

@Service
public class ProductApplicationService {

    private final ProductRepository repository;

    public ProductApplicationService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product create(Product product) {
        return repository.save(product);
    }

    public List<Product> list(){
        return repository.findAll();
    }

}
