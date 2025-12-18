import java.util.*;
public class Scrum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        ///////////////VARIABLES////////////////
        //Declaramos el mapa 
        int[][] mapa = new int[10][10];

        //Declaramos el array y lo rellenamos con la coordenadas de la incidencia        
        int lugarIncidenciaCoords[] = new int[2];
        boolean disponibilidadVehiculo;
        int tiempoRespuesta;
        char tipoVehiculo;
        HashMap<Character, Integer> vehiculoID = new HashMap<Character, Integer>();
        HashMap<Integer, Integer[]> vehiculoCoords = new HashMap<Integer,Integer[]>();





        /////////////////INPUTS DE USUARIO///////////
        //Le pedimos al usuario que nos introduzca las coordenadas del incidente        
        System.out.println("Dame la ubicación de la incidencia:");
        int coordenadaIncidenciaX = sc.nextInt();
        int coordenadaIncidenciay = sc.nextInt(); 
        
        
        
        
        
        
        
        
        
        ///////////INTRODUCCION DE DATOS EN VARIABLES///////////
        lugarIncidenciaCoords[0] = coordenadaIncidenciaX;
        lugarIncidenciaCoords[1] = coordenadaIncidenciay;












        /////////////OUTPUTS///////////
        
        //Impresion del mapa con las coordenadas
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa.length; j++) {
                System.out.print("[" + i + "]" + "[" + j + "] ");
            }
            System.out.println(" ");
        }

        int latitud = 0;
        int longitud = 0;

        //Busqueda de la ubicación de la incidencia
        //No le encontre utilidad
        while (!(latitud == lugarIncidenciaCoords[0]  && longitud == lugarIncidenciaCoords[1])){
            latitud++;
            longitud++;
        }




                sc.close();


























































    }
}