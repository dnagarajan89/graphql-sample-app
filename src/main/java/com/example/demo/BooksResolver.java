package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;

@Component
public class BooksResolver implements GraphQLResolver<Author> {

	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> getBooks(Author author) {
		return bookRepository.findByAuthorId(author.getId());
	}
	
}
