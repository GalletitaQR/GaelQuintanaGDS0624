package mx.utng.s11;

import java.util.Scanner;
/**
*@author:Gael Quintana Romero
*@date: 6/02/2024
*@group: GDS0624 
**/
public class Polimorfismo {
    public static void main(String[] args) {
        //Crear un objeto v de la calse venado
        Venado v = new Venado();

        Animal a = v;

        Hervivoro h = v;

        Object o = v;

        System.out.println("Venado: "+ (v instanceof Venado));
        System.out.println("Animal: "+ (a instanceof Animal));
        System.out.println("Hervivoro: "+ (h instanceof Hervivoro));
        System.out.println("Object: "+ (o instanceof Object));
        // System.out.println("Scanner: "+(v instanceof Scanner);
    }
}
