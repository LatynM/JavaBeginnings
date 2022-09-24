public class Main {

    public static void main(String[] args) {
	Docente d1=new Docente();
    Alumno a1=new Alumno();

    a1.nombre="Marcelo";
    a1.apellido="Latyn";
    d1.nombre="Mariel";
    d1.apellido="Schiavon";
    d1.titulo="Ingeniera";

    System.out.println(d1.getNombreCompleto());
    System.out.println(a1.printDireccion());
    System.out.println(d1.printEntidad());
    System.out.println(a1.printEntidad());
    System.out.println(a1.getNombreCompleto());
    }
}
