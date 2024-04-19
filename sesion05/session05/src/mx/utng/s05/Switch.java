package mx.utng.s05;

import java.util.Scanner;

//GAEL QUINTANA ROMERO GDS0624
public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teclea tu calificación de POO");
        int nota =scanner.nextInt();
        scanner.close();
        String mensaje= "";
        switch (nota) {
            case 10:
                mensaje= "Excelente";
                break;
            case 9:
            case 8:
                mensaje= "Muy bien";
                break;
            case 7:
                mensaje= "Bien Hecho";
                break;
            case 6: 
                mensaje= "Pasaste";
                break;
            case 5:
               mensaje= "Mejor vuelve a cursar";
               break;
            default:
                mensaje= "Nota no válida";
                break;
        }
        System.out.println(mensaje);
    }
}
