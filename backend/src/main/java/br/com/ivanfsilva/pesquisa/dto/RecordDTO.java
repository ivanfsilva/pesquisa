package br.com.ivanfsilva.pesquisa.dto;

import br.com.ivanfsilva.pesquisa.entities.Record;
import br.com.ivanfsilva.pesquisa.entities.enums.Platform;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;

@Data
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class RecordDTO implements Serializable {

    @EqualsAndHashCode.Include
    private Long id;
    private Instant moment;
    private String name;
    private Integer age;
    private String gameTitle;
    private Platform gamePlatform;
    private String genreName;

    public RecordDTO(Record entity) {
        this.id = entity.getId();
        this.moment = entity.getMoment();
        this.name = entity.getName();
        this.age = entity.getAge();
        this.gameTitle = entity.getGame().getTitle();
        this.gamePlatform = entity.getGame().getPlatform();
        this.genreName = entity.getName();
    }
}
