package br.com.ivanfsilva.pesquisa.repositories;

import br.com.ivanfsilva.pesquisa.entities.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {
}
