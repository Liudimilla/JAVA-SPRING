package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.LivroMinDTO;
import com.devsuperior.dslist.entities.Livro;
import com.devsuperior.dslist.repositories.LivroRepository;

@Service
public class LivroService {
	
	@Autowired
	private LivroRepository livroRepository;
	
	public List<LivroMinDTO> findAll(){
		List<Livro> result = livroRepository.findAll();
		List<LivroMinDTO> dto = result.stream().map(x -> new LivroMinDTO(x)).toList();
		return dto;
	}
	

}
