public class Docente implements ientidad
{
    String nombre,apellido,titulo;

    @Override
    public String getNombreCompleto(){
        return titulo + " "+apellido+" "+nombre;
    }

    @Override
    public String printEntidad() {
        return titulo+" "+nombre;
    }


}
