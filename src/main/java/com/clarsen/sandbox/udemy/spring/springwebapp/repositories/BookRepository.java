package com.clarsen.sandbox.udemy.spring.springwebapp.repositories;

import com.clarsen.sandbox.udemy.spring.springwebapp.domain.Book;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long>{
}
