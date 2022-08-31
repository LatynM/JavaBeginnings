import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int altura,peso=0;
        char sexo;


        System.out.println("INGRESE SU ALTURA (CM) >");
        altura= s.nextInt();
        System.out.println("INGRESE SU SEXO (F/M) >");
        sexo=s.next().charAt(0);

        switch (sexo)
        {
            case 'f': peso=altura-120;
            case 'F': peso=altura-120;
            case 'm': peso=altura-110;
            case 'M': peso=altura-110;
        }

        System.out.println("PESO IDEAL = "+peso);

    }
}
