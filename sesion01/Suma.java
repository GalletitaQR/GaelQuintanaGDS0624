import java.util.Scanner;
//GAEL QUINTANA ROMERO GDS0624
public class Suma{
	public static void main(String... args){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ingresa el primer numero ");
		int n1 = s.nextInt();
		
		System.out.println("Ingresa el segundo numero ");
		int n2 = s.nextInt();
		
		int r = n1 + n2;
		System.out.print("La suma es: " + r);
		
	}
	
}