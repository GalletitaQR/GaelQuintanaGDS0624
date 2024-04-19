package resources;
//GAEL QUINTANA ROMERO GDS0624

import mx.utng.Autor;
import mx.utng.ejercicio001.Libro;

public class App {
    public static void main(String[] args) {
        mx.utng.Autor autor = new Autor();
        autor.setName("Panchito");
        autor.setApellido("Torres");
        autor.setEdad(18);

        Libro libro = new Libro();
        libro.setTitulo("Reglas para seducir");
        libro.setAutor(autor);
        libro.setNumeropags(30);

        System.out.println("Libro "+libro.getTitulo());
        System.out.println("Libro "+libro.getAutor().getName()+" " + libro.getAutor().getApellido());
    }
}
