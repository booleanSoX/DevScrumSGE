public class TestMapa {
    public static int medidasMAPA = 10;

    public static void main(String[] args) {
        mostrarEstadoGeneral();
    }



    public static void mostrarEstadoGeneral(){
        System.out.println("=============== Mapa de emergencias ==============");
        for (int i = 0; i < medidasMAPA; i++) {
            for (int j = 0; j < medidasMAPA; j++) {
                System.out.print("[" + i + "," + j + "]");
            }
            System.out.println();
        }
        System.out.println("==================================================");
    }





}