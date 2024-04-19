package mx.utng.s11.reto1;

import java.time.LocalDate;
//GAEL QUINTANA ROMERO GDS0624

public class Persona {
    private String nombre;
    private byte edad;
    private final LocalDate fechaNacimiento;

    public Persona(String nombre, byte edad, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public String getNombre() {
        return nombre;
    }
    public byte getEdad() {
        return edad;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    
}
