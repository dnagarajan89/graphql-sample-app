package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;

@Component
public class AuthorResolver implements GraphQLResolver<Book> {

	@Autowired
	private AuthorRepository authorRepository;
	
	public Author getAuthor(Book book) {
		return authorRepository.findById(book.getAuthorId()).get();
	}
	
}
