package mx.utng.s11.reto1;

import java.time.LocalDate;
//GAEL QUINTANA ROMERO GDS0624

public class Programador extends Empleado{
    private String lenguajePrincipal;


    
    public Programador(String nombre, byte edad, LocalDate fechaNacimiento, float salario, String lenguajePrincipal) {
        super(nombre, edad, fechaNacimiento, salario);
        this.lenguajePrincipal = lenguajePrincipal;
    }



    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }
    
}
