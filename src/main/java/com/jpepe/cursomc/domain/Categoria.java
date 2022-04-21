package com.jpepe.cursomc.domain;

import lombok.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Categoria implements Serializable{
    private static final long serialVersionUID = 1l;

    @EqualsAndHashCode.Include
    private Integer id;
    private String nome;


}
