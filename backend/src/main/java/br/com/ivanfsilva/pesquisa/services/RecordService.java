package br.com.ivanfsilva.pesquisa.services;

import br.com.ivanfsilva.pesquisa.dto.RecordDTO;
import br.com.ivanfsilva.pesquisa.dto.RecordInsertDTO;
import br.com.ivanfsilva.pesquisa.entities.Game;
import br.com.ivanfsilva.pesquisa.entities.Record;
import br.com.ivanfsilva.pesquisa.repositories.GameRepository;
import br.com.ivanfsilva.pesquisa.repositories.RecordRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.List;

@Service
public class RecordService {

    private RecordRepository repository;
    private GameRepository gameRepository;
    private ModelMapper modelMapper;

    @Autowired
    public RecordService(RecordRepository repository, GameRepository gameRepository, ModelMapper modelMapper) {
        this.repository = repository;
        this.gameRepository = gameRepository;
        this.modelMapper = modelMapper;
    }

    @Transactional
    public RecordDTO insert(RecordInsertDTO dto) {

        Record entity = new Record();
        entity.setName(dto.getName());
        entity.setAge(dto.getAge());
        entity.setMoment(Instant.now());

        Game game = gameRepository.getOne(dto.getGameId());
        entity.setGame(game);

        entity = repository.save(entity);

        return new RecordDTO(entity);
    }

    @Transactional(readOnly = true)
    public Page<RecordDTO> findByMoments(Instant minDate, Instant maxDate, PageRequest pageRequest) {
        return repository.findByMoments(minDate, maxDate, pageRequest).map(r -> new RecordDTO(r));
    }
}
