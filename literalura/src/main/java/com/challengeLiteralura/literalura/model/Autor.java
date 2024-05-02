package com.challengeLiteralura.literalura.model;

import com.challengeLiteralura.literalura.model.DTO.AutorDTO;
import com.challengeLiteralura.literalura.repository.IAutorRepository;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Autores")
public class Autor{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int annoNacimiento;
    private int annoFallecimiento;
    private String nombre;
    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Libro> libros;

    public Autor(){}
    public Autor(AutorDTO dto){
        this.annoFallecimiento = dto.annoMuerte();
        this.annoNacimiento = dto.annoNacimiento();
        this.nombre = dto.nombre();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnnoNacimiento() {
        return annoNacimiento;
    }

    public void setAnnoNacimiento(int annoNacimiento) {
        this.annoNacimiento = annoNacimiento;
    }

    public int getAnnoFallecimiento() {
        return annoFallecimiento;
    }

    public void setAnnoFallecimiento(int annoFallecimiento) {
        this.annoFallecimiento = annoFallecimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return """
                
                ------AUTOR------
                Nombre: %s
                Año nacimiento: %d
                Año fallecimiento: %d
                Libros: %s
                -----------------
                """.formatted(nombre, annoNacimiento, annoFallecimiento,libros);
    }
}
