package com.example.ghactionsexample1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller for handling product-related operations.
 * Maps all requests to the /product endpoint.
 */
@RequestMapping("/product")
@RestController
public class ProductController {

    /**
     * Retrieves product information.
     * 
     * @return A string representation of the product
     */
    @GetMapping
    public String getProduct() {
        return "Test Product";
    }
}
