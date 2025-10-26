package com.tiangalo.catalog.infrastructure.persistence.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.tiangalo.catalog.domain.model.Product;
import com.tiangalo.catalog.domain.repository.ProductRepository;
import com.tiangalo.catalog.infrastructure.persistence.mapper.ProductEntityMapper;

@Repository
public class ProductRepositoryAdapter implements ProductRepository{

    private final ProductJPARepository jpaRepository;

    public ProductRepositoryAdapter(ProductJPARepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public Optional<Product> findBySku(String sku) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findBySku'");
    }

    @Override
    public Optional<Product> findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public Product save(Product product) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    @Override
    public List<Product> findAll() {
        return jpaRepository.findAll().stream().map(ProductEntityMapper::toDomain).toList();
    }

    
}
