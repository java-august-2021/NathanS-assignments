package com.nathanseals.pandc.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nathanseals.pandc.models.Category;
import com.nathanseals.pandc.models.Product;
import com.nathanseals.pandc.repositories.CategoryRepository;
import com.nathanseals.pandc.repositories.ProductRepository;

@Service
public class MainService {
	private final ProductRepository pRepo;
	private final CategoryRepository cRepo;
	
	public MainService(ProductRepository pRepo, CategoryRepository cRepo) {
		this.pRepo = pRepo;
		this.cRepo = cRepo;
	}
	
	//Products
	public List <Product> allP() {
		return pRepo.findAll();
	}
	public Product oneP(Long id) {
		return pRepo.findById(id).orElse(null);
	}
	public Product newP(Product product) {
		return pRepo.save(product);
	}
	//Categories
	public List <Category> allC() {
		return cRepo.findAll();
	}
	public Category createCategory(Category category) {
		return cRepo.save(category);
	}
	public Category oneC(Long id) {
		return cRepo.findById(id).orElse(null);
	}
	public Product addCategory(Product product) {
		return pRepo.save(product);
	}
	public List <Category> getUnavailableCategoriesFor(Product product) {
		return cRepo.findByProductsNotContains(product);
	}
	public List <Category> getAvailableCategoriesFor(Product product) {
		return cRepo.findByProductsContains(product);
	}

	public List<Product> getAvailableProductsFor(Category category){
		return pRepo.findByCategoriesNotContains(category);
	}
	
	public List<Product> getUnavailableProductsFor(Category category){
		return pRepo.findByCategoriesContains(category);
	}
	
}
