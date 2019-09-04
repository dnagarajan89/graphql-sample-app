package com.example.demo;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document
@AllArgsConstructor
public class Book {
	
	private String id;
	private String title;
	private String authorId;

	
}
