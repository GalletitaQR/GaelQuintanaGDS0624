package mx.utng.s08;
//GAEL QUINTANA ROMERO GDS0624

public class Fabrica {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Ford", "Shelby", 1965, 25000);

        Automovil auto2 = new Automovil("Bugatti", "355 Spider Centenaire", 2009, 10000);

        Automovil auto3 = new Automovil("Ferrari", "355 Spider Scagletti", 1957, 12000);

        Automovil auto4 =new Automovil("Kia", "Rio", 2019, 30500);

        System.out.println("Auto 1, hash: "+auto1.hashCode());
        System.out.println("Auto 2, hash: "+auto2.hashCode());
        System.out.println("Auto 3, hash: "+auto3.hashCode());

        System.out.println("Auto 4: hash: "+ auto4.hashCode());

        Automovil auto5 = auto1;

        System.out.println("Auto 5: hash: "+ auto5.hashCode());

        if(auto5.equals(auto1)){
            System.out.println("Es el mismo objeto");
        }

    }
        
    }