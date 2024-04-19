package mx.utng.s11.reto01;
/**  
*@author:Gael Quintana Romero
*@date: 6/02/2024
*@group: GDS0624 
*/ 
public class PruebaFigura {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(9);
        cuadrado.calcularArea();

        Triangulo triangulo = new Triangulo(7, 2);
        triangulo.calcularArea();

        Rectangulo rectangulo = new Rectangulo(3, 1.9);
        rectangulo.calcularArea();
    }
}
