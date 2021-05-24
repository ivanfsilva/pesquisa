package br.com.ivanfsilva.pesquisa.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class RecordInsertDTO implements Serializable {

    @EqualsAndHashCode.Include
    private String name;
    private Integer age;
    private Long gameId;


}
