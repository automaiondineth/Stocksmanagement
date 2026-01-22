package com.shop.stockmanager;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brandName;
    private String barcode;
    private int stockQuantity;
    private int minStockAlert;

    // ===== Constructors =====
    public Product() {
    }
/*in java we use the this key word to understand which veriable belongs to whicjh object.*/
    public Product(String brandName, String barcode, int stockQuantity, int minStockAlert) {
        this.brandName = brandName;
        this.barcode = barcode;
        this.stockQuantity = stockQuantity;
        this.minStockAlert = minStockAlert;
    }

    // ===== Getters & Setters =====
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public int getMinStockAlert() {
        return minStockAlert;
    }

    public void setMinStockAlert(int minStockAlert) {
        this.minStockAlert = minStockAlert;
    }
}

