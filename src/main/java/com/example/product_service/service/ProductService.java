package com.example.product_service.service;

import com.example.product_service.model.Product;
import com.example.product_service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repo;

    public Product addProduct(Product product) {
        return repo.save(product);
    }

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Optional<Product> getProductById(String id) {
        return repo.findById(id);
    }

    public Product updateProduct(String id, Product updated) {
        return repo.findById(id).map(product -> {
            product.setProductName(updated.getProductName());
            product.setPrice(updated.getPrice());
            product.setSellerId(updated.getSellerId());
            return repo.save(product);
        }).orElse(null);
    }

    public void deleteProduct(String id) {
        repo.deleteById(id);
    }
}
