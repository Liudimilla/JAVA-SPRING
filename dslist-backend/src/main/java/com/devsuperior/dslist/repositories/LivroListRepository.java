package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.LivroList;

public interface LivroListRepository extends JpaRepository<LivroList, Long> {

}
