package br.com.ivanfsilva.pesquisa.services;

import br.com.ivanfsilva.pesquisa.dto.GameDTO;
import br.com.ivanfsilva.pesquisa.entities.Game;
import br.com.ivanfsilva.pesquisa.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    private GameRepository repository;

    @Autowired
    public GameService(GameRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public List<GameDTO> findAll() {
        List<Game> list = repository.findAll();

        return list.stream().map( g -> new GameDTO(g)).collect(Collectors.toList());
    }
}
