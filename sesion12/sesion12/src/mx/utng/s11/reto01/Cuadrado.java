package mx.utng.s11.reto01;
/**
*@author:Gael Quintana Romero
*@date: 6/02/2024
*@group: GDS0624 
**/
public class Cuadrado implements Figura{
    private double lado;
    
    

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        System.out.println("EL AREA TOTAL ES: "+(lado*lado)+" metros cuadrados");
    }
}
