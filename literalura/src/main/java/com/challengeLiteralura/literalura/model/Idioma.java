package com.challengeLiteralura.literalura.model;

import com.challengeLiteralura.literalura.model.DTO.IdiomaDTO;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "idiomas")
public class Idioma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String siglaIdioma;
    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Libro> libros;
    public Idioma(IdiomaDTO dto){
        siglaIdioma = dto.lenguajes().get(0);
    }

    public  Idioma(){}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSiglaIdioma() {
        return siglaIdioma;
    }

    public void setSiglaIdioma(String siglaIdioma) {
        this.siglaIdioma = siglaIdioma;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return """
                ---------IDIOMA----------
                Codigo: %s
                Libros: %s
                """.formatted(siglaIdioma, libros);
    }
}
