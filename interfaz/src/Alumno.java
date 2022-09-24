public class Alumno implements ientidad, iDireccion
{

    String nombre,apellido;

    @Override
    public String getNombreCompleto() {
        return apellido+" "+nombre;
    }

    @Override
    public String printEntidad() {
        return nombre;
    }

    @Override
    public String printDireccion() {
        return "la direccion";
    }


}
