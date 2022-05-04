package com.bookstore.Bookstore.dio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.Bookstore.dio.model.Livro;
import com.bookstore.Bookstore.dio.repository.LivroRepository;

@Service
public class LivroService {
	 @Autowired
	    private LivroRepository livroRepository;

	    // Salvar
	    public Livro addLivro(Livro livro) {
	        return livroRepository.save(livro);
	    }

	    // listar
	    public List<Livro> addAllLivros(List<Livro> livros) {
	        return  livroRepository.saveAll(livros);
	    }

	    // Utualizar
	    public Livro updateLivro(Livro livro) {
	        Livro existingEMP = livroRepository.findById(livro.getId()).orElse(null);
	        System.out.println(livro);
	        if(existingEMP == null) {
	            System.out.println("Emp not found");
	            return  livroRepository.save(livro);
	        }else  {
	            existingEMP.setName(livro.getName());	        	       
	            existingEMP.setImage(livro.getImage());	         	          
	            existingEMP.setQuantity(livro.getQuantity());
	            existingEMP.setCategory(livro.getCategory());
	            existingEMP.setPrice(livro.getPrice());
	    
	            livroRepository.save(existingEMP);
	        }
	        return livro;
	    }

	    // Deletar
	    public boolean deleteLivroByID(int id) {
	    	Livro existingEMP = livroRepository.getById(id);
	        if(existingEMP != null) {
	        	livroRepository.deleteById(id);
	            return true;
	        }
	        return false;
	    }

	    public List<Livro> getAllLivros() {
	        return livroRepository.findAll();
	    }

		public Livro getLivroByID(int id) {
			return null;
		}

		public Livro getLivroByName(String name) {
			return null;
		}
}
