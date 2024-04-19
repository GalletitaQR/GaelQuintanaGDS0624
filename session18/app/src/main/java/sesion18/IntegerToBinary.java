package sesion18;

public class IntegerToBinary {
    public static void main(String[] args) {
        int miNumero = 20;
        String binario = Integer.toBinaryString(miNumero);
        System.out.printf("El número %d es en binario %s", miNumero, binario);
    }
}
