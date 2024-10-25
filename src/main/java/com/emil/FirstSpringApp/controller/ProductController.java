package com.emil.FirstSpringApp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    private final ProductSevice productSevice;

    public ProductController(ProductService productService) {
        this.productSevice = productService;
    }

    @GetMapping
    public List<ProductController> getProducts() {
        return productSevice.getProducts();
    }
}
