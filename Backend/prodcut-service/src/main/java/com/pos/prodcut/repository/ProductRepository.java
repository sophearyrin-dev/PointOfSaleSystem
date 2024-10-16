package com.pos.prodcut.repository;

import com.pos.prodcut.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
