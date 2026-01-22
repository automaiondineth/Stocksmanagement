package com.shop.stockmanager;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long productId;
    private int quantity;
    private String supplier;
    private double purchasePrice;
    private LocalDateTime date;

    public Purchase() {
    }
    public Purchase(Long id, Long productId, int quantity, String supplier, LocalDateTime date){
        this.id=id;
        this.productId=productId;
        this.quantity=quantity;
        this.supplier=supplier;
        this.date=date;

    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id=id;

    }

    public Long getProductId(){
        return productId;
    }

    public void setProductId(Long id){
        this.productId=productId;

    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;

    }

    public String getSupplier(){
        return supplier;
    }

    public void setSupplier(String supplier){
        this.supplier=supplier;

    }
    public LocalDateTime getSaleDate() {
        return (date);
    }

    public void setSaleDate(LocalDateTime saleDate) {
        this.date = date;

    }

}
