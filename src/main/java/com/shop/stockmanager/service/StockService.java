package com.shop.stockmanager.service;

import com.shop.stockmanager.Product;
import com.shop.stockmanager.Purchase;
import com.shop.stockmanager.Sales;
import com.shop.stockmanager.repository.ProductRepository;
import com.shop.stockmanager.repository.PurchaseRepository;
import com.shop.stockmanager.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class StockService {
    /*In here we are asking spring we need this reppos to be called here create manage and inject we are doing*/
    @Autowired private ProductRepository productRepository;
    @Autowired private PurchaseRepository purchaseRepository;
    @Autowired private SaleRepository saleRepository;

    public int recordSale(Long productID, int quantity , String source){
        Product p=productRepository.findById(productID).orElseThrow();
        if (p.getStockQuantity() < quantity) throw new RuntimeException("Not enough stock");
        p.setStockQuantity(p.getStockQuantity() - quantity);
        productRepository.save(p);

        Sales sales = new Sales();
        sales.setProductId(productID);
        sales.setQuantity(quantity);
        sales.setSaleDate(LocalDateTime.now());
        sales.setSource(source);
        saleRepository.save(sales);

        return p.getStockQuantity();
    }
    public int addPurchase(Long productId, int quantity) {
        Product p = productRepository.findById(productId).orElseThrow();
        p.setStockQuantity(p.getStockQuantity() + quantity);
        productRepository.save(p);

        Purchase purchase = new Purchase();
        purchase.setProductId(productId);
        purchase.setQuantity(quantity);
        purchase.setSaleDate(LocalDateTime.now());
        purchaseRepository.save(purchase);

        return p.getStockQuantity();


    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Long getTheProductCount(){

        return productRepository.count();
    }
}
