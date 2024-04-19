package mx.utng.s05;
//GAEL QUINTANA ROMERO GDS0624
public class prim {
    public static void main(String[] args) {
        //Entero muy pequeño -127 al 127
        byte valorByte = 127;
        System.out.println(valorByte);
        //entero corto -32767 al 32767
        short valorShort = 32767;
        System.out.println(valorShort);
        //entero base -2 147 483 648 al 2147483648
        int valorInt = 300000000;
        System.out.println(valorInt);
        //entero long 9223372036854775808 al -9223372036854775808
        long valorLong = 999999999999999999l;
        System.out.println(valorLong);
        //Numero real tienen punto decimal es de 6 cifras despues del punto
        float valorFloat = 7.5f;
        System.out.println(valorFloat);
        //Numero double con doble precision es de 16 cifras despues del punto
        double valorDouble = 3.5;
        System.out.println(valorDouble);
        //Numero boolean con true/false
        boolean valorBoolean = true;
        System.out.println(valorBoolean);
        //Primitivov para texto
        char valorChar = 'a';
        System.out.println(valorChar);
        //Parsear
        int numInt1 = (int)valorFloat;
        System.out.println(numInt1);
        
        char numChar = 'M';
        numChar++;
        int numInt2 = numChar;
        System.out.printf("Char: %c, Entero: %d%n", numChar, numInt2);
    }
}
