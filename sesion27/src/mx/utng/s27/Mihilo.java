package mx.utng.s27;

import java.util.concurrent.TimeUnit;

public class Mihilo extends Thread{
     String parametro;

     public Mihilo (String parametro){
        this.parametro = parametro;
     }

     @Override
     public void run() {
         while (!"terminar".equals(parametro)) {
            mostrarInformacion();
            pausarUnSegundo();
         }
     }

     public void setParametro(String parametro) {
         this.parametro = parametro;
     }
     
     private void mostrarInformacion(){
        String tipoHilo = isDaemon() ? "Daemon" : "Usuario";

        System.out.println(tipoHilo + "\t | Nombre: "+ getName()+ "\t | ID: "+getId()+"\t | Parametro: "+parametro);

     } 
     private static void pausarUnSegundo(){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
     }

     public static void main(String[] args) {
        Mihilo mihilo1 = new Mihilo("uno");
        mihilo1.start();

        Mihilo mihilo2 = new Mihilo("dos");
        mihilo2.setDaemon(true);
        mihilo2.start();

        mihilo1.setParametro("terminar");
        System.out.println("Fin del hilo main");
     }
}