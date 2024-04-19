package mx.utng.s21.factory;

public class ConsoleLog implements Logger{
    @Override
    public void log(String msg) {
      System.out.println(msg);
      
    }
}
