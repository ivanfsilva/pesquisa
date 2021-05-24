package br.com.ivanfsilva.pesquisa.resources;

import br.com.ivanfsilva.pesquisa.dto.RecordDTO;
import br.com.ivanfsilva.pesquisa.dto.RecordInsertDTO;
import br.com.ivanfsilva.pesquisa.entities.Record;
import br.com.ivanfsilva.pesquisa.services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/records")
public class RecordResource {

    private RecordService service;

    @Autowired
    public RecordResource(RecordService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<RecordDTO> insert(@RequestBody RecordInsertDTO dto) {
        RecordDTO newDTO = service.insert(dto);
        return ResponseEntity.ok().body(newDTO);
    }
}
