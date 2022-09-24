import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    String name,letra;
    int id;
    Boolean respuesta=true;

    Scanner s = new Scanner(System.in);

	Sala s1 = new Sala("Sala01","KILL BILL",5);
    Sala s2= new Sala("Sala02","ROCKETMAN",3);

    Espectador[] listaEspectadores = new Espectador[100];

    System.out.println("INGRESE ESPECTADORES DE LA LISTA PARA LUEGO ASIGNAR A UNA SALA");
    System.out.println("'S' PARA CONTINUAR/'N' PARA SALIR");

    do{
       System.out.println("INGRESE NOMBRE >");
       name=s.next();
       System.out.println("INGRESE DNI >");
       id=s.nextInt();
       listaEspectadores[0] = new Espectador(name,id);
       System.out.println("AGREGAR OTRO ESPECTADOR ?");
       letra=s.next();
       switch (letra)
       {
           case "N":respuesta=false;
           case "n":respuesta=false;
           case "S":respuesta=true;
           case "s":respuesta=true;
       }
       System.out.println(respuesta);
       System.out.println(letra);
    }while(respuesta=true);











    }
}
