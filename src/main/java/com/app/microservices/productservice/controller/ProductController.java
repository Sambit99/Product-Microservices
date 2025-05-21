package com.app.microservices.productservice.controller;

import com.app.microservices.productservice.dto.ProductRequest;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @PostMapping
    public void createProduct(@RequestBody ProductRequest body){

    }

    @GetMapping("/{id}")
    public void getProductById(@PathVariable ObjectId id){

    }
}
