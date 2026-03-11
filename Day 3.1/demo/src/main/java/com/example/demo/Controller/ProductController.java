package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.request.ProductRequest;
import com.example.demo.dto.response.ApiResponse;
import com.example.demo.dto.response.ProductResponse;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    public final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/create")
    public ApiResponse<ProductResponse> createProduct(@RequestBody ProductRequest request) {

        ProductResponse productResponse = productService.createProduct(request);

        return new ApiResponse<ProductResponse>("success", productResponse);
    }

    @GetMapping("/all")
    public ApiResponse<List<ProductResponse>> getAllProducts() {
    List<ProductResponse> products = productService.getAllProducts();
    return new ApiResponse<>("success", products);
}
}