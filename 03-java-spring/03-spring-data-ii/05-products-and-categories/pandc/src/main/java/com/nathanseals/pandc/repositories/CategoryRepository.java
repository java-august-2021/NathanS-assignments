package com.nathanseals.pandc.repositories;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nathanseals.pandc.models.Category;
import com.nathanseals.pandc.models.Product;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
	List<Category> findAll();
	List<Category> findAllByProducts(Product product);
	List<Category> findByProductsNotContains(Product product);
	List<Category> findByProductsContains(Product product);
}
