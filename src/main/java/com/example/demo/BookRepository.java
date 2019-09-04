package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, String> {
	List<Book> findAll();
	List<Book> findByAuthorId(String authorId);
	Optional<Book> findById(String id);
}
