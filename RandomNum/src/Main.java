import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args)
    {
    int random,guess,guessCounter=0;
    int top=101;
    Scanner s = new Scanner(System.in);
    Random rand = new Random();
    random=rand.nextInt(top);

    System.out.println(random);

    System.out.println("NUMERO ALEATORIO GENERADO");
    System.out.println("INGRESE NUMERO ENTRE 1 Y 100");

    do {
        guess=s.nextInt();
        guessCounter++;
        if(guess<random)
        {
            System.out.println("EL NUMERO INGRESADO ES MENOR");
        }
        else
        {
            if(guess>random)
            {
                System.out.println("EL NUMERO INGRESADO ES MAYOR");
            }
            else
            {
                System.out.println("CORRECTO");
            }
        }

    }while(guess!=random);

    System.out.println("NUMERO DE INTENTOS: "+guessCounter);


    }
}
