public class Sala {
     String nombre;
     String pelicula;
     int capacidad;



    public Sala(String nombre, String pelicula, int capacidad) {
        this.nombre = nombre;
        this.pelicula = pelicula;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPelicula() {
        return pelicula;
    }

    public int getCapacidad() {
        return capacidad;
    }

}
