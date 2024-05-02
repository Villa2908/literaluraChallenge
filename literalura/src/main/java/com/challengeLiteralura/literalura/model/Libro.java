package com.challengeLiteralura.literalura.model;

import com.challengeLiteralura.literalura.model.DTO.IdiomaDTO;
import com.challengeLiteralura.literalura.model.DTO.LibroDTO;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;
    @ManyToOne
    private Autor autor;
    @ManyToOne
    private Idioma idioma;
    private int descargas;
    @Column(name = "id_api")
    private int idApi;

    public Libro(){}
    public Libro(LibroDTO dto){
        this.titulo = dto.titulo();
        this.idApi = dto.id();
        this.descargas = dto.descargas();
        this.autor = new Autor(dto.autor().get(0));
        this.idioma = new Idioma(new IdiomaDTO(dto.idiomas()));
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor Autor) {
        this.autor = Autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public int getDescargas() {
        return descargas;
    }

    public void setDescargas(int descargas) {
        this.descargas = descargas;
    }

    public int getIdApi() {
        return idApi;
    }

    public void setIdApi(int idApi) {
        this.idApi = idApi;
    }

    @Override
    public String toString() {
        return """
                
                ------LIBRO------
                Titulo: %s
                Autor: %s
                Idioma: %s
                Descargas: %d
                -----------------
                """.formatted(titulo, autor.getNombre(), idioma.siglaIdioma, descargas);
    }
}
