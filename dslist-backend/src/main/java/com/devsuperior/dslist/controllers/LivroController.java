package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.LivroDTO;
import com.devsuperior.dslist.dto.LivroMinDTO;
import com.devsuperior.dslist.services.LivroService;

@RestController
@RequestMapping(value = "/livros")
public class LivroController {
	
	@Autowired
	private LivroService livroService;
	
	@GetMapping(value = "/{id}")
	public LivroDTO findById(@PathVariable Long id) {
		LivroDTO result = livroService.findById(id);
		return result;
	}
	
	public List<LivroMinDTO> findAll(){
		List<LivroMinDTO> result = livroService.findAll();
		return result;
	}

}
