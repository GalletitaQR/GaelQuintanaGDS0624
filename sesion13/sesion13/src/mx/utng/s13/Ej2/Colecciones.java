package mx.utng.s13.Ej2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Colecciones {
    public static void main(String[] args) {
        List<String> listaCadenas = new ArrayList<>();
        listaCadenas.add("uno");
        listaCadenas.add("dos");
        listaCadenas.add("tres");
        listaCadenas.add("cuatro");
        listaCadenas.add("cinco");
        System.out.println(listaCadenas+"\n");

        for(int i = 0; i<listaCadenas.size();i++){
           System.out.printf("%s%n", listaCadenas.get(i));
        }

        System.out.println("=============foreach============");
        for(String cadena : listaCadenas){
            System.out.println(cadena);
        }

        //Conjunto de cadenas 
        Set<String> setCadenas = new HashSet<>();
        setCadenas.add("uno");
        setCadenas.add("dos");
        setCadenas.add("dos");
        setCadenas.add("tres");
        setCadenas.add("cuatro");
        setCadenas.add("cinco");

        // Foreach para imprimir los valores
        System.out.println("======SET de Cadenas=====");
        for (String cadena : setCadenas) {
            System.out.println(cadena);
        }

        List<Numero> listaNumeros = new ArrayList<>();
        listaNumeros.add(new Numero("uno"));
        listaNumeros.add(new Numero("dos"));
        listaNumeros.add(new Numero("tres"));
        listaNumeros.add(new Numero("cuatro"));
        listaNumeros.add(new Numero("cinco"));
        
        //Foreach para impirmimr numero
        System.out.println("=======List de Numero=======");
        for (Numero numero : listaNumeros) {
            System.out.println(numero.getNombre());
        }

        Set<Numero> setNumeros = new HashSet<>();
        Numero n6 = new Numero("seis");
        Numero n7 = n6;
        setNumeros.add(new Numero("uno"));
        setNumeros.add(new Numero("dos"));
        setNumeros.add(new Numero("dos"));
        setNumeros.add(new Numero("tres"));
        setNumeros.add(new Numero("cuatro"));
        setNumeros.add(new Numero("cinco"));
        setNumeros.add(n6);
        setNumeros.add(n7);
        //Foreach para impirmimr valores
        System.out.println("=======Set de Numero=======");
        for (Numero numero : setNumeros) {
            System.out.println(numero.getNombre());
        }
    }
}
