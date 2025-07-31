package com.gkfcsolution.springecom.service;

import com.gkfcsolution.springecom.model.Product;
import com.gkfcsolution.springecom.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created on 2025 at 20:49
 * File: null.java
 * Project: SpringEcom
 *
 * @author Frank GUEKENG
 * @date 31/07/2025
 * @time 20:49
 */
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(int productId) {
        return productRepository.findById(productId)
                .orElse(new Product(-1)); // Return null if product not found
    }
}
