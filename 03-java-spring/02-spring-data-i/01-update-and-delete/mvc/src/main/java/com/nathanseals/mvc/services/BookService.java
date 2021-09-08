package com.nathanseals.mvc.services;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nathanseals.mvc.models.Book;
import com.nathanseals.mvc.repositories.BookRepository;
@Service
public class BookService {
    // adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    public Book updateBook(Long id, String title, String desc, String language, int numOfPages) {
    	Book update = findBook(id);
    	update.setTitle(title);
    	update.setDescription(desc);
    	update.setLanguage(language);
    	update.setNumberOfPages(numOfPages);
    	update.setUpdatedAt(null);
    	return bookRepository.save(update);
    }
    public void deleteBook(Long id) {
    	bookRepository.deleteById(id);
    }
}
