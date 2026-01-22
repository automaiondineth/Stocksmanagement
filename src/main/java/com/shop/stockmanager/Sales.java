package com.shop.stockmanager;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

/*this entity is suing to say this is a DB class and we are using to
* indicate dbs we are using separate entity class coz each class represent separate Db tables */
@Entity
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long productId;
    private int quantity;
    private LocalDateTime saleDate;
    private String source;

    public Sales() {

    }

    public Sales(Long id, Long productId, int quantity, LocalDateTime saleDate, String source) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
        this.saleDate = saleDate;
        this.source = source;
    }

    public Long getId() {
        return (id);
    }

    public void setId(Long id) {
        this.id = id;

    }

    public Long getProductId() {
        return (productId);
    }

    public void setProductId(Long id) {
        this.productId = productId;

    }

    public int getQuantity() {
        return (quantity);
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;

    }

    public LocalDateTime getSaleDate() {
        return (saleDate);
    }

    public void setSaleDate(LocalDateTime saleDate) {
        this.saleDate = saleDate;

    }

    public String getSource() {
        return (source);
    }

    public void setSource(String source) {
        this.source = source;

    }
}