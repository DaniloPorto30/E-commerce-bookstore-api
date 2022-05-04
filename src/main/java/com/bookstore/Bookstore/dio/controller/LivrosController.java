package com.bookstore.Bookstore.dio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.Bookstore.dio.model.Livro;
import com.bookstore.Bookstore.dio.service.LivroService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/livro")
public class LivrosController {

	@Autowired
	private LivroService livroService;

	// Add new livro
	@PostMapping("/addLivro")
	public Livro addLivro(@RequestBody Livro livro ) {
       return livroService.addLivro(livro);
	}

	// Add mais de 1 livro
	@PostMapping("/addLivros")
	public List<Livro> addAllLivros(@RequestBody List<Livro> livros) {
		return livroService.addAllLivros(livros);
	}

	// Get livro by Id
	@GetMapping("/getLivroByID/{id}")
	public Livro getLivroById(@PathVariable int id) {
		return livroService.getLivroByID(id);
	}

	// Get livro by name
	@GetMapping("/getLivroByName/{name}")
	public Livro getLivroByName(@PathVariable String name) {
		return livroService.getLivroByName(name);
	}

	// Update livro
	@PutMapping("/updateLivro")
	public Livro updateLivro(@RequestBody Livro livro) {
		return livroService.updateLivro(livro);
	}

	// Delete livro
	@DeleteMapping("/deleteLivroById/{id}")
	public boolean deleteLivroByID(@PathVariable int id) {
		return livroService.deleteLivroByID(id);
	}

	// Get all livro
	@GetMapping("/getAll")
	public List<Livro> getAllLivro() {
		return livroService.getAllLivros();
	}
}
