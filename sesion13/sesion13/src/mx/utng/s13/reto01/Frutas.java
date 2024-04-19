package mx.utng.s13.reto01;
/**  
*@author:Gael Quintana Romero
*@date: 10/02/2024
*@group: GDS0624 
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Frutas {
 
    public static void main(String[] args) {
        List<String> listaFrutas = new ArrayList<>();
        listaFrutas.add("Plátanos");
        listaFrutas.add("Sandía");
        listaFrutas.add("Pera");
        listaFrutas.add("Manzana");
        listaFrutas.add("Naranja");
        listaFrutas.add("Kiwi");
        System.out.println("=============Frutas==============");
        System.out.println(listaFrutas);
        System.out.println();
        System.out.println();
        
        System.out.println("=============INVIRTIENDO EL ORDEN==============");
        Collections.reverse(listaFrutas);
        System.out.println(listaFrutas);
        System.out.println();
        System.out.println();
        
        System.out.println("===========ELEMENTO MÁS PEQUEÑO AlFABETICAMENTE==============");
        String pequenno = Collections.min(listaFrutas);
        System.out.println(pequenno);
        System.out.println();
        System.out.println();

        System.out.println("===========ELEMENTO MÁS GRANDE AlFABETICAMENTE==============");
        String grande = Collections.max(listaFrutas);
        System.out.println(grande);
        System.out.println();
        System.out.println();

        System.out.println("==============ORDEN ALFABETICO===============");
        Collections.sort(listaFrutas);
        System.out.println(listaFrutas);
        System.out.println();
        System.out.println();

        System.out.println("=============DONDE ESTA LA PERA Y LA NARANJA============");
        System.out.println("La Pera está en la posición: "+ Collections.binarySearch(listaFrutas, "Pera"));
        System.out.println("La Naranja está en la posición: "+ Collections.binarySearch(listaFrutas, "Naranja"));
        System.out.println();
        System.out.println();

        System.out.println("=======AGREGA 3 MANZANAS A LA LISTA=======");
        Collections.addAll(listaFrutas, "Manzana", "Manzana", "Manzana");
        System.out.println(listaFrutas);
        System.out.println();
        System.out.println();

        System.out.println("==========DESORDENANDO LA LISTA ALEATORIAMENTE===========");
        Collections.shuffle(listaFrutas);
        System.out.println(listaFrutas);
        System.out.println();
        System.out.println();

        System.out.println("==========¿CUÁNTAS MANZANAS HAY EN LA LISTA?==========");
        System.out.println("Hay "+Collections.frequency(listaFrutas, "Manzana")+ " Manzanas");
    }

    
}

