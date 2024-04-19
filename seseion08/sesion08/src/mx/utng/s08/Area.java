package mx.utng.s08;
//GAEL QUINTANA ROMERO GDS0624 RETO 01

public class Area {
    public static void main(String[] args) {
        Cuadrado c = new Cuadrado(5);
        System.out.println("Area del cuadrado: "+c.area());

        Rectangulo r = new Rectangulo(8,3);
        System.out.println("Area del rectángulo: "+r.area());
    }
}

/**
 * Cuadrado
 */
class Cuadrado {
    private int lado;

    public Cuadrado(){
        this.lado= 0;
    }

    public Cuadrado(int lado){
    this.lado = lado;    
    }

    public int area(){
        return (int)Math.pow(lado, 2);
    }
}

    //RECTANGULO
    class Rectangulo {

        private double alto;
        private double ancho;
        
        public Rectangulo(double alto, double ancho) {
            this.alto = alto; this.ancho = ancho;
        }
        public Rectangulo(double dato) {
            this.alto = dato;
            this.ancho = dato;
        }
        public double area() {
            return alto * ancho;
        }
}
