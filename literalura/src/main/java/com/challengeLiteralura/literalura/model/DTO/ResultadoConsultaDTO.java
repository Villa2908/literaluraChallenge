package com.challengeLiteralura.literalura.model.DTO;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.HashMap;
import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record ResultadoConsultaDTO(
        @JsonAlias("results")
        List<LibroDTO> resultado
) {
}
