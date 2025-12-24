import java.util.*;

public class Logica {

    //Funcion para crear Y validar un id
    public static int generadorID(){
        Random rand = new Random();
        //creamos la instancia del modulo random
        //para luego poder generar un numero aleatorio

        int id = rand.nextInt(100) + 1;
        //Definimos un numero del 1 al 100
        //De momento, ya que es una prueba
        // si luego queremos escalarlo sera ampliar el rango (no estoy seguro)

        while(!(Main.vehiculosID.add(id)))

        {
            id = rand.nextInt(100) + 1;
        }
        //Mientras .add nos devuelva (!)false
        //significara que ese ID ya existe
        //y volvera a generar un id nuevo
        //no utilizamos if porque no es eficiente
        //para generar IDs varios.

        System.out.println("ID generado con éxito: "+id);
        return id;


    }

    public static void registrarServicio(Scanner sc){

    }

    public static void mostrarEstadoGeneral(){
        System.out.println("============= Mapa de emergencias ===================");
        for (int i = 0; i < Main.medidasMAPA; i++) {
            for (int j = 0; j < Main.medidasMAPA; j++) {
                System.out.print("[" + i + "]" + "[" + j + "]");
            }
        }
        System.out.println("============= Mapa de emergencias ===================");
    }



    public static void finalizarServicio(Scanner sc) {
    }

}

