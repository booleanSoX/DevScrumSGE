import java.util.*;
public class Main {
    public static int medidasMAPA = 10;
    public static HashSet<Integer> vehiculosID = new HashSet<>();
    public static int[][] mapa = new int[medidasMAPA][medidasMAPA];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            Menu.mostrarMenu();
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                Menu.gestionarOpcion(opcion, sc);
            } else {
                System.out.println("Error: Introdueix un número.");
                sc.next();
            }

        } while (opcion != 4);

        sc.close();










        ///////////////VARIABLES////////////////
        //Declaramos el mapa 
        int[][] mapa = new int[10][10];

        //Declaramos el array y lo rellenamos con la coordenadas de la incidencia        
        int lugarIncidenciaCoords[] = new int[2];
        int tiempoRespuesta;
        char tipoVehiculo;

        boolean disponibilidadVehiculo;



        HashMap<Character, Integer> vehiculoID = new HashMap<Character, Integer>();
        HashMap<Integer, Integer[]> vehiculoCoords = new HashMap<Integer,Integer[]>();




        /////////////////INPUTS DE USUARIO///////////
        //Le pedimos al usuario que nos introduzca las coordenadas del incidente        
        System.out.println("Dame la ubicación de la incidencia:");
        int coordenadaIncidenciaX = sc.nextInt();
        int coordenadaIncidenciay = sc.nextInt();



        // En el main:

        
        ///////////INTRODUCCION DE DATOS EN VARIABLES///////////
        lugarIncidenciaCoords[0] = coordenadaIncidenciaX;
        lugarIncidenciaCoords[1] = coordenadaIncidenciay;











        /////////////OUTPUTS///////////






















































    }
}