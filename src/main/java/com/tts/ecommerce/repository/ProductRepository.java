package com.tts.ecommerce.repository;

import com.tts.ecommerce.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository <Product, Long>{
List<Product> findAll();
Product findById(long id);
}

//add everything from the slide