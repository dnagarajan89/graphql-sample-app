package com.example.demo;

import org.springframework.data.mongodb.core.mapping.Document;

import graphql.schema.GraphQLInputType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document
@AllArgsConstructor
public class Author implements GraphQLInputType {

	private String id;
	private String authorName;

	@Override
	public String getName() {
		return "Author";
	}
}
