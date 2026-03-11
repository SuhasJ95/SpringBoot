package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.request.ProductRequest;
import com.example.demo.dto.response.ProductResponse;
import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductResponse createProduct(ProductRequest request) {

        int total = request.getPrice().stream().mapToInt(Integer::intValue).sum();

        int GST = total * 18 / 100;
        int nettotal = total + GST;

        Product product = new Product();
        product.setName(request.getName());
        product.setGST(GST);
        product.setTotal(total);
        product.setNettotal(nettotal);

        Product savedProduct = productRepository.save(product);

        return new ProductResponse(
                savedProduct.getName(),
                savedProduct.getId(),
                GST,
                total,
                nettotal,
                request.getPrice()
        );
    }


    public List<ProductResponse> getAllProducts() {
        return productRepository.findAll()
                .stream()
                .map(product -> new ProductResponse(
                        product.getName(),
                        product.getId(),
                        product.getGST(),
                        product.getTotal(),
                        product.getNettotal(),
                        null
                ))
                .toList();
    }
}