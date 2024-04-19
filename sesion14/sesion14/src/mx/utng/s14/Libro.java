package mx.utng.s14;

public class Libro implements Comparable<Libro>{
    private final String TITULO;
    private int prioridad;

    public Libro(String TITULO, int prioridad){
         this.TITULO = TITULO;
         this.prioridad = prioridad;
    }

    public String getTITULO() {
        return TITULO;
    }
    
    @Override
    public int compareTo(Libro libro) {
        return this.prioridad = libro.prioridad;
    }
    
}
