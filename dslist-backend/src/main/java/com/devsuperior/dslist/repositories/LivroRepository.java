package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Livro;
//Camada de acesso a dados
public interface LivroRepository extends JpaRepository<Livro, Long> {

}
