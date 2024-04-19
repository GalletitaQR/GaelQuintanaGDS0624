package mx.utng.sesion4;
//GAEL QUINTANA ROMERO GDS0624
public class Letras {
    public static void main(String[] args) {
        Lector lector = new Lector();
        ContadorCaracteres contador = new ContadorCaracteres();
        //Uso del lector para imprimir txto y leer valores
        lector.muestraMensaje("Teclcea una palabra: ");
        String palabra = lector.leerEntrada();

        //Usar el contador para saber cuantos caracteres hay por palabra
        int vocales = contador.cuentaVocales(palabra);
        lector.muestraMensaje("El numero de vocales es "+vocales);
        int consonantes = contador.cuentaConsonantes(palabra);
        lector.muestraMensaje("El numero de consonantes es "+consonantes);
        int numeros = contador.cuentaNumeros(palabra);
        lector.muestraMensaje("El numero de numeros es "+numeros);
        int simbolos = contador.cuentaSimbolos(palabra);
        lector.muestraMensaje("El numero de simbolos es "+simbolos);
        
     }
}
