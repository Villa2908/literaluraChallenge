package com.challengeLiteralura.literalura.repository;

import com.challengeLiteralura.literalura.model.Idioma;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface IIdiomaRepository extends JpaRepository<Idioma, Integer> {
    List<Idioma> findBySiglaIdioma(String siglaIdioma);
}
