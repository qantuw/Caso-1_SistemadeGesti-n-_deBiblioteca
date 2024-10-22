package Libreria;

import java.util.ArrayList;
import java.util.List;

public class Audiolibro extends Libro {

    private double duracionGrabacion;
    private String formatoAudio;

    private Audiolibro(Builder builder) {
        super(builder.titulo, builder.autores, builder.resenas);
        this.duracionGrabacion = builder.duracionGrabacion;
        this.formatoAudio = builder.formatoAudio;
    }

    public double getDuracionGrabacion() {
        return duracionGrabacion;
    }

    public String getFormatoAudio() {
        return formatoAudio;
    }

    public static class Builder {
        private String titulo;
        private List<Autor> autores = new ArrayList<>();
        private List<Reseña> resenas = new ArrayList<>();
        private double duracionGrabacion;
        private String formatoAudio;

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

        public Builder setDuracionGrabacion(double duracionGrabacion) {
            this.duracionGrabacion = duracionGrabacion;
            return this;
        }

        public Builder setFormatoAudio(String formatoAudio) {
            this.formatoAudio = formatoAudio;
            return this;
        }

        public Audiolibro build() {
            return new Audiolibro(this);
        }
    }
}

