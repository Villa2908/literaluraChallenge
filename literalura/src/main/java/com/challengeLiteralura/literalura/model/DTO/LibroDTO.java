package com.challengeLiteralura.literalura.model.DTO;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record LibroDTO(
        @JsonAlias(value = "id") int id,
        @JsonAlias(value = "title") String titulo,
        @JsonAlias(value = "authors") List<AutorDTO> autor,
        @JsonAlias(value = "languages") List<String> idiomas,
        @JsonAlias(value = "download_count") int descargas
) {
}
