package br.com.ivanfsilva.pesquisa.dto;

import br.com.ivanfsilva.pesquisa.entities.Game;
import br.com.ivanfsilva.pesquisa.entities.enums.Platform;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class GameDTO implements Serializable {

    @EqualsAndHashCode.Include
    private Long id;
    private String title;
    private Platform platform;

    public GameDTO(Game entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.platform = entity.getPlatform();
    }
}
