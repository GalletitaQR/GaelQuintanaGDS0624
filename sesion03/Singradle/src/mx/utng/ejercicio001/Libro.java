package mx.utng.ejercicio001;

import mx.utng.Autor;

public class Libro {
    private String titulo;
    private Autor autor;
    private int numeropags;


    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public int getNumeropags() {
        return numeropags;
    }
    public void setNumeropags(int numeropags) {
        this.numeropags = numeropags;
    }

    
}
