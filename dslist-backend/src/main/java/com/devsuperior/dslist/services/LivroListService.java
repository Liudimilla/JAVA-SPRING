package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.LivroListDTO;
import com.devsuperior.dslist.entities.LivroList;
import com.devsuperior.dslist.repositories.LivroListRepository;

@Service
public class LivroListService {

	@Autowired
	private LivroListRepository livroListRepository;
	
	@Transactional(readOnly = true)
	public List<LivroListDTO> findAll(){
		List<LivroList> result = livroListRepository.findAll();
		return result.stream().map(x -> new LivroListDTO(x)).toList();
		
	}
	
}
