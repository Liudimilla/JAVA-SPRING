package com.devsuperior.dslist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dslist.entities.Livro;
import com.devsuperior.dslist.projections.LivroMinProjection;
//Camada de acesso a dados
public interface LivroRepository extends JpaRepository<Livro, Long> {
    //consulta SQL Customizada no dataJPA
	@Query(nativeQuery = true, value = """
			SELECT tb_livro.id, tb_livro.title, tb_livro.livro_year AS livroYear, tb_livro.img_url AS imgUrl,
			tb_livro.short_description AS shortDescription, tb_belonginl.position
			FROM tb_livro
			INNER JOIN tb_belonginl ON tb_livro.id = tb_belonginl.livro_id
			WHERE tb_belonginl.list_id = :listId
			ORDER BY tb_belonginl.position
				""")
	List<LivroMinProjection> searchByList(Long listId);
}
