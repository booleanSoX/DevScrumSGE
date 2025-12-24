public class Modelos {
}


class Vehiculo {
    int id;
    String tipo;
    int fila;
    int col;
    boolean disponible;

    public Vehiculo(String tipo, int f, int c) {
        this.id = Logica.generadorID();
        this.tipo = tipo;
        this.fila = f;
        this.col = c;
        this.disponible = true;
    }
}

