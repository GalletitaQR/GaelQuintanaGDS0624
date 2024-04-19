package mx.utng.s13.Ej1;

import java.time.LocalDate;

public class ProfesorInterino extends Profesor{
    private LocalDate fechaTerminaciono;

    public ProfesorInterino(String nombre, String apellido, String idProfesor, LocalDate fechaTerminaciono) {
        super(nombre, apellido, idProfesor);
        this.fechaTerminaciono = fechaTerminaciono;
    }

    public LocalDate getFechaTerminaciono() {
        return fechaTerminaciono;
    }

    public void setFechaTerminaciono(LocalDate fechaTerminaciono) {
        this.fechaTerminaciono = fechaTerminaciono;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ProfesorInterno \n: Fecha de Terminacion de Contrato->"+fechaTerminaciono);
    }
}
