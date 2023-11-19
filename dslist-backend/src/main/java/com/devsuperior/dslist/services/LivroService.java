package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.LivroDTO;
import com.devsuperior.dslist.dto.LivroMinDTO;
import com.devsuperior.dslist.entities.Livro;
import com.devsuperior.dslist.projections.LivroMinProjection;
import com.devsuperior.dslist.repositories.LivroRepository;

@Service
public class LivroService {
	
	@Autowired
	private LivroRepository livroRepository;
	
	@Transactional(readOnly = true)
	public LivroDTO findById(Long id) {
		Livro result = livroRepository.findById(id).get();
		LivroDTO dto = new LivroDTO(result);
		return dto;
	}
	
	
	@Transactional(readOnly = true)
	public List<LivroMinDTO> findAll(){
		List<Livro> result = livroRepository.findAll();
		return result.stream().map(x -> new LivroMinDTO(x)).toList();
		
	}
	
	@Transactional(readOnly = true)
	public List<LivroMinDTO> findByList(Long listId){
		List<LivroMinProjection> result = livroRepository.searchByList(listId);
		return result.stream().map(x -> new LivroMinDTO(x)).toList();
		
	}
	

}
