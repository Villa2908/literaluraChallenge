package com.challengeLiteralura.literalura.repository;

import com.challengeLiteralura.literalura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IAutorRepository extends JpaRepository<Autor, Integer> {
        List<Autor> findIdByNombreContainsIgnoreCase(String nombreAutor);

        List<Autor> findByAnnoFallecimientoLessThanEqual(int aniolimite);
        List<Autor> findByAnnoNacimientoBetween(int anioIncio, int anioLimite);
}
