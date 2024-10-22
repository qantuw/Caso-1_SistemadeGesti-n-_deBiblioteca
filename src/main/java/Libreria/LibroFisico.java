package Libreria;

import java.util.ArrayList;
import java.util.List;

public class LibroFisico extends Libro {

    private int numeroPaginas;
    private double altura;
    private double ancho;
    private double grosor;

    private LibroFisico(Builder builder) {
        super(builder.titulo, builder.autores, builder.resenas);
        this.numeroPaginas = builder.numeroPaginas;
        this.altura = builder.altura;
        this.ancho = builder.ancho;
        this.grosor = builder.grosor;
    }


    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public double getAltura() {
        return altura;
    }

    public double getAncho() {
        return ancho;
    }

    public double getGrosor() {
        return grosor;
    }

    public static class Builder {
        private String titulo;
        private List<Autor> autores = new ArrayList<>();
        private List<Reseña> resenas = new ArrayList<>();
        private int numeroPaginas;
        private double altura;
        private double ancho;
        private double grosor;

        public Builder(String titulo) {
            this.titulo = titulo;
        }

        public Builder addAutor(Autor autor) {
            this.autores.add(autor);
            return this;
        }

        public Builder addResena(Reseña resena) {
            this.resenas.add(resena);
            return this;
        }

        public Builder setNumeroPaginas(int numeroPaginas) {
            this.numeroPaginas = numeroPaginas;
            return this;
        }

        public Builder setDimensiones(double altura, double ancho, double grosor) {
            this.altura = altura;
            this.ancho = ancho;
            this.grosor = grosor;
            return this;
        }

        public LibroFisico build() {
            return new LibroFisico(this);
        }
    }
}
