package mx.utng.s11.reto1;

import java.time.LocalDate;
//GAEL QUINTANA ROMERO GDS0624

public class Empleado extends Persona{
    private float salario;

    public float getSalario() {
        return salario;
    }

    public Empleado(String nombre, byte edad, LocalDate fechaNacimiento, float salario) {
        super(nombre, edad, fechaNacimiento);
        this.salario = salario;
    }
}
