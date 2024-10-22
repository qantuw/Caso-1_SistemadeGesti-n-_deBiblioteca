package qantuw.casolibreria; 

import Libreria.Audiolibro;
import Libreria.Autor;
import Libreria.LibroDigital;
import Libreria.LibroFisico;

public class CasoLibreria {

    public static void main(String[] args) {
        
        System.out.println("Bienvenidos a la librería");

        
        LibroFisico libroFisico = new LibroFisico.Builder("Los Juegos del Hambre")
                .addAutor(new Autor("Suzanne Collins"))
                .setNumeroPaginas(500)
                .setDimensiones(20, 15, 3)
                .build();

        System.out.println("Libro Físico:");
        System.out.println("Título: " + libroFisico.getTitulo());
        System.out.println("Autores: " + libroFisico.getAutores().get(0).getNombre());
        System.out.println("Número de páginas: " + libroFisico.getNumeroPaginas());

     
        LibroDigital libroDigital = new LibroDigital.Builder("Los ríos profundos")
                .addAutor(new Autor("José María Arguedas"))
                .setFormato("PDF")
                .setTamanoArchivo(3.6)
                .setEnlaceDescarga("Losriosprofundos.com")
                .build();

        System.out.println("\nLibro Digital:");
        System.out.println("Título: " + libroDigital.getTitulo());
        System.out.println("Autores: " + libroDigital.getAutores().get(0).getNombre());
        System.out.println("Formato: " + libroDigital.getFormato());
        System.out.println("Tamaño del archivo: " + libroDigital.getTamanoArchivo() + " MB");
        System.out.println("Enlace de descarga: " + libroDigital.getEnlaceDescarga());

       
        Audiolibro audiolibro = new Audiolibro.Builder("Harry Potter")
                .addAutor(new Autor("J.K. Rowling"))
                .setDuracionGrabacion(40.0)
                .setFormatoAudio("MP3")
                .build();

        System.out.println("\nAudiolibro:");
        System.out.println("Título: " + audiolibro.getTitulo());
        System.out.println("Autores: " + audiolibro.getAutores().get(0).getNombre());
        System.out.println("Duración de la grabación: " + audiolibro.getDuracionGrabacion() + " horas");
        System.out.println("Formato de audio: " + audiolibro.getFormatoAudio());
    }
}

 
