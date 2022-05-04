package com.bookstore.Bookstore.dio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.Bookstore.dio.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Integer> {


	Livro getByName(String name);

	Livro findByName(String name);

}
