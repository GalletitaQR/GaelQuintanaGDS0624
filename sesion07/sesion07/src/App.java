import mx.utng.s07.Lector;
import mx.utng.s07.ListaTareas;
import mx.utng.s07.Menu;

//GAEL QUINTANA ROMERO GDS0624
public class App {
    public static void main(String[] args) throws Exception {
        //crear objetos necesarios
        Menu menu = new Menu();
        Lector lector = new Lector();
        ListaTareas listaTareas = new ListaTareas();

        byte opcionSelecionada = 0;

        do{
          menu.muestraOpciones();
          opcionSelecionada = lector.leerOpcion();
          System.out.println("\n\n La opcion seleccionada es: "+ opcionSelecionada);
          switch (opcionSelecionada) {
            case 1:
                listaTareas.crearNuevaLista();
                break;
            case 2:
                listaTareas.verLista();
                break;
            case 3:
                listaTareas.verTareaLista();
                break;
            case 4:
                listaTareas.actualizarista();
                break;            
            case 5:
                listaTareas.eliminarLista();
                break;            
            case 6:
            System.out.println("Saliendo");
                listaTareas.salir();
                break;     
            default:
            System.out.println("No se encontro");
                break;
          }
        }while (opcionSelecionada!=6);
    }
}
