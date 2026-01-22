package com.shop.stockmanager.repository;

import com.shop.stockmanager.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product , Long> {

    // Find product by barcode
    Product findByBarcode(String barcode);

    // Find products by brand name
    List<Product> findByBrandName(String brandName);

    // Find products with stock less than a value
    List<Product> findByStockQuantityLessThan(int quantity);

}
