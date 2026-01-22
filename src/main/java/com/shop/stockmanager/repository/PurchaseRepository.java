package com.shop.stockmanager.repository;

import com.shop.stockmanager.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/*Jpa repos use to do the data base oparations */
public interface PurchaseRepository extends JpaRepository <Purchase, Long> {
    // Find product by barcode
    Purchase findByBarcode(String barcode);

    // Find products by brand name
    List<Purchase> findByBrandName(String brandName);

    // Find products with stock less than a value
    List<Purchase> findByStockQuantityLessThan(int quantity);


}
