package com.nathanseals.pandc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nathanseals.pandc.models.Category;
import com.nathanseals.pandc.models.Product;
import com.nathanseals.pandc.services.MainService;

@Controller
public class ProductController {
	private final MainService serv;
	public ProductController(MainService serv) {
		this.serv = serv;
	}
	@GetMapping("/")
	public String index(@ModelAttribute("product") Product product, Model model) {
		List <Product> allP = serv.allP();
		model.addAttribute("products", allP);
		return "allProducts.jsp";
	}
	@PostMapping("/products/create")
	public String newProd(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if (result.hasErrors()) {
			return "allProducts.jsp";
		} else {
			serv.newP(product);
			return "redirect:/";
		}
	}
	@GetMapping("/products/{id}")
	public String showProduct(@PathVariable("id") Long id, Model model) {
		Product thisProduct = serv.oneP(id);
		model.addAttribute("product", thisProduct);
		model.addAttribute("categories", serv.allC());
//		model.addAttribute("unaffiliatedCategories", serv.getAvailableCategoriesFor(thisProduct));
//		model.addAttribute("affiliatedCategories", serv.getUnavailableCategoriesFor(thisProduct));
		return "oneProduct.jsp";
	}
	@PostMapping("/products/{prodID}/addCategory")
	public String addCategoryToProduct(@PathVariable("prodId") Long prodId, @RequestParam(value = "catId") Long catId, Model model) {
		Product thisProduct = serv.oneP(prodId);
		Category thisCategory = serv.oneC(catId);
		thisProduct.getCategories().add(thisCategory);
		serv.addCategory(thisProduct);
		return "redirect:/products/{prodId}";
	}
	@GetMapping("/categories/new")
	public String newCategory(@ModelAttribute("category") Category category, Model model) {
		List<Category> categories = serv.allC();
		model.addAttribute("categories", categories);
		return "oneCategory.jsp";
	}
	@PostMapping(value = "/categories/create")
	public String createCategory(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if(result.hasErrors()) {
			return "oneCategory.jsp";
		} else {
			serv.createCategory(category);
			return "redirect:/categories/new";
		}
	}
}
