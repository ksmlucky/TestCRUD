package com.example.testgradle.repository;

import com.example.testgradle.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// <Product, ë idì íì>
@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
    Optional<Product> findByEnglishname(String englishname);
}
