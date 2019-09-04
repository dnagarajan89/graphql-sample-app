package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class Query implements GraphQLQueryResolver {
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private AuthorRepository authorRepository;
	
	public List<Book> getBooks() {
		return bookRepository.findAll();
	}
	
	public List<Author> getAuthors() {
		return authorRepository.findAll();
	}
	
	public Author getAuthor(String id) {
		return authorRepository.findById(id).get();
	}
	
	public Book getBook(String id) {
		return bookRepository.findById(id).get();
	}
	
}
 