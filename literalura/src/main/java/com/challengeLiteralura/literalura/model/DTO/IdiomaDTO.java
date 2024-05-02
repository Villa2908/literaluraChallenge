package com.challengeLiteralura.literalura.model.DTO;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public record IdiomaDTO(
        List<String> lenguajes
) {
}
