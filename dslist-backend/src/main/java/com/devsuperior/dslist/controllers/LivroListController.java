package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.LivroListDTO;
import com.devsuperior.dslist.dto.LivroMinDTO;
import com.devsuperior.dslist.services.LivroListService;
import com.devsuperior.dslist.services.LivroService;

@RestController
@RequestMapping(value = "/list")
public class LivroListController {
	
	@Autowired
	private LivroListService livroListService;
	
	@Autowired
	private LivroService livroService;
	
	@GetMapping
	public List<LivroListDTO> findAll(){
		List<LivroListDTO> result = livroListService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{listId}/livros")
	public List <LivroMinDTO> findById(@PathVariable Long listId) {
		List <LivroMinDTO> result = livroService.findByList(listId);
		return result;
	}

	
}
