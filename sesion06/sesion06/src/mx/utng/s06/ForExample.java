package mx.utng.s06;
//GAEL QUINTANA ROMERO GDS0624
import java.util.Scanner;

public class ForExample {
    public static void main(String[] args) {
        System.out.println("Ejemplo del ciclo for");
        //Imprimimos los números del 1 al 8
        for(int i =1; i<=10;i++){
           System.out.println(i);
        }
        //imprimimos los numero del 2 en 2 al 100
        for(int i=2; i<=100;i+=2){
            System.out.println(i);
         }
        //tabla del 5
        for(int i=2; i<=10;i+=2){
            System.out.printf("5x%d=%d%n", i, i*5);
        }
        //tabla del número que me diga el usario
        Scanner readScanner = new Scanner(System.in);
        System.out.println("Imprime la tabla que quieres");
        int n = readScanner.nextInt();
        readScanner.close();
        for(int i = 1; i <=10 ; i++){
            System.out.printf("%dx%d=%d%n", n, i,n*i);
        }
        //Muestra los valores de un arreglo dado
        String[] frutas = {"Mango","Pera", "Manzana", "Melon", "Platano"};
        for (int i = 0; i < frutas.length; i++){
          System.out.println(frutas[i]);
        }
        for (String fruta : frutas){
            System.out.println(fruta);
        }
        //imprime del 1 al 10
        byte i = 0;
        while (i++<10) {
            System.out.println(i);
        }
        //Usando do while
        System.out.println("Usando do while");
        i = 1;
        do{
        System.out.println(i);
        }while(i++<10);
    }
}
