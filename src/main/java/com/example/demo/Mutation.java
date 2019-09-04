package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class Mutation implements GraphQLMutationResolver {
	
	@Autowired
	BookRepository bookRepository;
	
	@Autowired
	AuthorRepository authorRepository;
	
	public Book createBook(String id, String name, String authorId) {
		return bookRepository.save(new Book(id, name, authorId));
	}
	
	public Author createAuthor(String id, String name) {
		return authorRepository.save(new Author(id, name));
	}
	
}
