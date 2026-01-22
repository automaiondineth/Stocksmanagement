package com.shop.stockmanager.repository;

import com.shop.stockmanager.Purchase;
import com.shop.stockmanager.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sales, Long> {
    // Find product by barcode
    Sales findByBarcode(String barcode);

    // Find products by brand name
    List<Sales> findByBrandName(String brandName);

    // Find products with stock less than a value
    List<Sales> findByStockQuantityLessThan(int quantity);
}
