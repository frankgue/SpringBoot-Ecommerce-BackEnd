package com.gkfcsolution.springecom.repo;

import com.gkfcsolution.springecom.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created on 2025 at 20:51
 * File: null.java
 * Project: SpringEcom
 *
 * @author Frank GUEKENG
 * @date 31/07/2025
 * @time 20:51
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    // Additional query methods can be defined here if needed
}
