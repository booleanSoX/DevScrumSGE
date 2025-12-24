import java.util.Scanner;

public class Menu {
        public static void mostrarMenu() {
            System.out.println("\n=== GESTIÓ D'EMERGÈNCIES DANA (AVSRE) ===");

            System.out.println("1. Introduir nou servei d'emergència");

            System.out.println("2. Mostrar estat general (Recursos i Mapa)");

            System.out.println("3. Finalitzar un servei actiu");

            System.out.println("4. Eixir");

            System.out.print("Selecciona una opció: ");
        }

    public static void gestionarOpcion(int opcion, Scanner sc) {
        switch (opcion) {
            case 1:
                Logica.registrarServicio(sc);
                break;
            case 2:
                Logica.mostrarEstadoGeneral();
                break;
            case 3:
                Logica.finalizarServicio(sc);
                break;
            case 4:
                System.out.println("Tancant sistema...");
                break;
            default:
                System.out.println("Opció no vàlida.");
        }
    }



}




