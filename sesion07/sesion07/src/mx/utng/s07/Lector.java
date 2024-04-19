package mx.utng.s07;
//GAEL QUINTANA ROMERO GDS0624
import java.util.Scanner;

public class Lector {
    private Scanner scanner = new Scanner(System.in);

    public byte leerOpcion(){
        System.out.println("Opcion: ");
        return scanner.nextByte();
    }
}
