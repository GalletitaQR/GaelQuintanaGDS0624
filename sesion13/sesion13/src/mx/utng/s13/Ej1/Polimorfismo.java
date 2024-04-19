package mx.utng.s13.Ej1;

import java.time.LocalDate;
import java.time.Month;

public class Polimorfismo {

    public static void main(String[] args, String string) {
        Profesor profesor1 = new Profesor("Pamela", "Villanueva", "UTNG00541");
        profesor1.mostrarDatos();
        
        ProfesorInterino profesorInterino1 = new ProfesorInterino("Elsa", "Ramírez", "UTNG00392", LocalDate.of(2024, Month.DECEMBER, 21));
        profesorInterino1.mostrarDatos();

        Persona p = new Persona("Gael", "Quintana");
        p = new Profesor(p.getNombre(), p.getApellido(), "UTNG00001");
        p.mostrarDatos();
    }
}
