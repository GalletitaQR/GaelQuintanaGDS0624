package mx.utng.s11.reto01;
/**
*@author:Gael Quintana Romero
*@date: 6/02/2024
*@group: GDS0624 
**/
public class Rectangulo implements Figura{
    private double base;
    private double altura;

    

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void calcularArea() {
        System.out.println("EL AREA TOTAL ES: "+(base*altura)+" metros cuadrados");
    }
}
