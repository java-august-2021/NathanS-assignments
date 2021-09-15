package com.nathanseals.pandc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nathanseals.pandc.models.Category;
import com.nathanseals.pandc.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
	List<Product> findAll();

	List<Product> findByCategoriesNotContains(Category category);

	List<Product> findByCategoriesContains(Category category);
}
