package com.clarsen.sandbox.udemy.spring.springwebapp.repositories;

import com.clarsen.sandbox.udemy.spring.springwebapp.domain.Author;

import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long>{
}
