package mx.utng.s06.reto01;
//GAEL QUINTANA ROMERO GDS0624
import java.util.Scanner;
//GAEL QUINTANA ROMERO GDS0624
public class NumerosPares {
    public static void main(String[] args) {
        /*Utilizando el modulo poner todos los numeros 
         Pares que hay en un rango dado por el usuario
         inicio,fin, i*/
         Scanner scanner = new Scanner(System.in);
         System.out.println("Escribe el rango de inicio");
         int inicio = scanner.nextInt();
         System.out.println("Escribe el rango final");
         int finale = scanner.nextInt();
         scanner.close();
         System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''");
        for(int i = inicio; i < finale;i++){
        System.out.println(i);
        }
    }

}
