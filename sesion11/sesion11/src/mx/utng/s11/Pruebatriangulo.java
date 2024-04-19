package mx.utng.s11;

public class Pruebatriangulo {
   public static void main(String[] args) {
//GAEL QUINTANA ROMERO GDS0624

    Triangulo triangulo1 = new Triangulo(5.0, 4.0, "Color Pastel");
    System.out.println("Info. del Triangulo");
    triangulo1.mostrarDimension();
    triangulo1.mostrarEstilo();
    System.out.println("Su área es: "+triangulo1.area());

    Triangulo triangulo2 = new Triangulo(52.0, 24.0, "Color suicidio");
    System.out.println("Info. del Triangulo");
    triangulo2.mostrarDimension();
    triangulo2.mostrarEstilo();
    System.out.println("Su área es: "+triangulo2.area());

    Triangulo triangulo3 = new Triangulo(13.0, 69.0, "C010r 4mSi3d4d");
    System.out.println("Info. del Triangulo");
    triangulo3.mostrarDimension();
    triangulo3.mostrarEstilo();
    System.out.println("Su área es: "+triangulo3.area());
   }
}