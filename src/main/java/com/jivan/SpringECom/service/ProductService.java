package com.jivan.SpringECom.service;

import com.jivan.SpringECom.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "Lenovo", 50000),
            new Product(102, "Dell", 45000),
            new Product(103, "HP", 40000)
    ));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int productId) {
//       return products.stream().filter(p->(p.getProductId()== productId))
//       .findFirst().get();
        return products.stream()
                .filter(p -> (p.getProductId() == productId))
                .findFirst()
                .orElse(new Product(100, "No product", 0));
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
