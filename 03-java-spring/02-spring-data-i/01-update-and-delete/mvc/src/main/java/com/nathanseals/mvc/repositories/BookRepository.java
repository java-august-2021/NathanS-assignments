package com.nathanseals.mvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nathanseals.mvc.models.Book;
@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
	List<Book> findAll(); //Finds all books
	List<Book> findByDescriptionContaining(String search); //finds books with descriptions containing the search string
	Long countByTitleContaining(String search); //counts how many titles contain the search string
	Long deleteByTitleStartingWith(String search); //deletes a book that starts with a specific title
}
