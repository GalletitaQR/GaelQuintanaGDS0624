
 /**
 * @Author: Gael Quintana Romero
 * @Date: 16/02/2024
 * @Group: GDS0624
 */
package mx.utng.s17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reto2 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\zackg\\OneDrive\\Escritorio\\javaGaelQuintanaGDS0624\\sesion17\\sesion17\\src\\mx\\utng\\s17\\Reto2.txt");

            //Coloco el objeto que sirve para escribir en el archivo creado
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Demain, dès 'aube par Victor Hugo\n\n");
            
            bw.write("Demain, dès l'aube, à l'heure où blanchit la campagne,");//Debe llevar un newLine para salto de línea
            bw.newLine();
            bw.write("Je partirai. Vois-tu, je sais que tu m'attends.");
            bw.newLine();
            bw.write("J'irai par la forêt, j'irai par la montagne.");
            bw.newLine();
            bw.write("Je ne puis demeurer loin de toi plus longtemps.");
            bw.newLine();
            bw.newLine();
            bw.write("Je marcherai les yeux fixés sur mes pensées,");
            bw.newLine();
            bw.write("Sans rien voir au dehors, sans entendre aucun bruit,");
            bw.newLine();
            bw.write("Seul, inconnu, le dos courbé, les mains croisées,");
            bw.newLine();
            bw.write("Triste, et le jour pour moi sera comme la nuit.");
            bw.newLine();
            bw.newLine();
            bw.write("Je ne regarderai ni l'or du soir qui tombe,");
            bw.newLine();
            bw.write("Ni les voiles au loin descendant vers Harfleur,");
            bw.newLine();
            bw.write("Et quand j'arriverai, je mettrai sur ta tombe");
            bw.newLine();
            bw.write("Un bouquet de houx vert et de bruyère en fleur.");
            bw.newLine();
            bw.write("<------------------------>");
            bw.write("Autor: Gael Quintana Romero");
            bw.close();
            //Creo un objeto que permita la lectura de archivo
            FileReader fr = new FileReader("C:\\Users\\zackg\\OneDrive\\Escritorio\\javaGaelQuintanaGDS0624\\sesion17\\sesion17\\src\\mx\\utng\\s17\\Reto2.txt");
            BufferedReader br = new BufferedReader(fr);

            String linea = null;

            while ((linea = br.readLine())!=null) {
                System.out.println(linea);
            }
    }
}