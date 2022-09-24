

public class Main {

    public static void main(String[] args) {
    int in=5,i;
    double d;

    d=in; //casting implicito
    System.out.println(d);

    //casting explicito
    d=8.7;
    in=(int)d;
    System.out.println(in);
    d=8.7;
    Math.round(d); //mal
    System.out.println(Math.round(d)); //bien


        Persona p = new Persona();
        Empleado e = new Empleado();

        p = e; //<- casting implicito - si empleado hereda de persona se puede hacer casting
        e = (Empleado)p; //<- casting explicito - se puede al reves con castng explicito


        Vehiculo v= new Vehiculo();
        Auto4Puertas a4 = new Auto4Puertas();
        Barco b = new Barco();

        /*
        v=b; //<- {upcasting - puedo guardar ambos porque son hijos de vehiculo
        v=a4;
        */


        //a4=(Auto4Puertas)v; //<- downcasting

        //arreglo de objetos
        Vehiculo[] listav = new Vehiculo[100];
        listav [0] = a4;
        a4.precio=450.0;
        Bicicleta bi = new Bicicleta();
        bi.precio=40.0;
        listav[1]=bi;

        while (listav!=null)
        {
        }


        double suma=0;
        /*
        for(i=0;i<100;i++)
        {
            suma=suma+listav[i].precio;
            System.out.println(listav[i].precio);
        }
    */
        i=0;
        while(i<100 && listav[i]!=null)
        {
            suma=suma+listav[i].precio;
            System.out.println(listav[i].precio);
        }

        public static void print(Vehiculo vehiculo);{
            System.out.println(vehiculo.nombre);
        }
    }
}
