public class Persona {
     String nombre;
     int dni;

     //setter
     public Persona(String nombre, int dni){
         this.nombre=nombre;
         this.dni=dni;
     }

    //getter
    public String getNombre() {
        return nombre;
    }
    public int getDni() {
        return dni;
    }
}
