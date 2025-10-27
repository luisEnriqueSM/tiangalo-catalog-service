package com.tiangalo.catalog.api.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiangalo.catalog.application.ProductApplicationService;
import com.tiangalo.catalog.domain.model.Product;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductApplicationService productService;

    public ProductController(ProductApplicationService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> findAllProducts(){
        return ResponseEntity.ok().body(productService.list());
    }

}
