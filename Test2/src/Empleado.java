public class Empleado extends Persona{
    private double sueldo;

    public Empleado(String nombre, int dni) {
        super(nombre, dni);
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
