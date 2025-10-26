package com.tiangalo.catalog.infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiangalo.catalog.infrastructure.persistence.entity.ProductEntity;

public interface ProductJPARepository extends JpaRepository<ProductEntity, Long>{

}
