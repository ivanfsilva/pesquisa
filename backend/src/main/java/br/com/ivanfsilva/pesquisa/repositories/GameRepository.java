package br.com.ivanfsilva.pesquisa.repositories;

import br.com.ivanfsilva.pesquisa.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
}
