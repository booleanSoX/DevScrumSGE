public class Vehiculo {
    int id;
    String tipo;
    int fila;
    int col;
    boolean disponible;

    public Vehiculo(int id, String tipo, int f, int c) {
        this.id = generadorid();
        this.tipo = tipo;
        this.fila = f;
        this.col = c;
        this.disponible = true;
    }
}