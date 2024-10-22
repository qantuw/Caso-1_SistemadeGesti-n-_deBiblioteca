package Libreria;

import java.util.ArrayList;
import java.util.List;

public abstract class Libro {

    protected String titulo;
    protected List<Autor> autores;
    protected List<Reseña> resenas;

    protected Libro(String titulo, List<Autor> autores, List<Reseña> resenas) {
        this.titulo = titulo;
        this.autores = (autores != null) ? autores : new ArrayList<>();
        this.resenas = (resenas != null) ? resenas : new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public List<Reseña> getResenas() {
        return resenas;
    }

    public void setResenas(List<Reseña> resenas) {
        this.resenas = resenas;
    }

}