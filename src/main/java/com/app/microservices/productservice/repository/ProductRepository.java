package com.app.microservices.productservice.repository;

import com.app.microservices.productservice.model.Product;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, ObjectId> {
}
