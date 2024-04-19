package mx.utng.s11.reto1;

import java.time.LocalDate;
//GAEL QUINTANA ROMERO GDS0624
public class pruebaInstancia {
    public static void main(String[] args) {
        Programador programador1 = new Programador("Gael", (byte)19, LocalDate.of(2004, 10, 03), 50000, "Python");
        System.out.println("Dato del programador: "+ programador1.getNombre());
        System.out.println("Nombre: "+ programador1.getNombre());
        System.out.println("Edad: "+ programador1.getEdad());
        System.out.println("Fecha de nacimiento: "+ programador1.getFechaNacimiento());
        System.out.println("Salario: "+programador1.getSalario());
        System.out.println("Lenguaje principal: "+programador1.getLenguajePrincipal());

        DBA admin1 = new DBA("Pipo", (byte)19, LocalDate.of(2004, 11, 05), 250, "PostgreSQL");
        System.out.println("Dato del administrador de base de datos: "+ admin1.getNombre());
        System.out.println("Nombre: "+ admin1.getNombre());
        System.out.println("Edad: "+ admin1.getEdad());
        System.out.println("Fecha de nacimiento: "+ admin1.getFechaNacimiento());
        System.out.println("Salario: "+admin1.getSalario());
        System.out.println("Herramienta de Consultas: "+admin1.getHerramientaConsultas());

    }
}
