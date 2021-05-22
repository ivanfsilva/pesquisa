package br.com.ivanfsilva.pesquisa.repositories;

import br.com.ivanfsilva.pesquisa.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
}
