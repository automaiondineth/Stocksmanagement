package com.shop.stockmanager.Controller;

import com.shop.stockmanager.Product;
import com.shop.stockmanager.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/products")
public class StockController {
    //private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }
    @Autowired
    private StockService stockService;

    @PostMapping("/sales")
    public Map<String,Object> recordSale(@RequestBody Map<String,Object> body) {
        Long productId = Long.valueOf(body.get("product_id").toString());
        int quantity = Integer.parseInt(body.get("quantity").toString());
        String source = body.get("source").toString();
        int stock = stockService.recordSale(productId, quantity, source);
        return Map.of("success", true, "current_stock", stock);
    }

    @PostMapping("/purchases")
    public Map<String,Object> addPurchase(@RequestBody Map<String,Object> body) {
        Long productId = Long.valueOf(body.get("product_id").toString());
        int quantity = Integer.parseInt(body.get("quantity").toString());
        int stock = stockService.addPurchase(productId, quantity);
        return Map.of("success", true, "current_stock", stock);
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return stockService.getAllProducts();
    }

}

