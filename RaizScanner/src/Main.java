import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        double radicando,raiz;

        System.out.println("INGRESE NUMERO PARA CALCULAR RAIZ CUADRADA >");
        radicando=s.nextDouble();
        if(radicando<0)
        {
            System.out.println("NO SE PUEDE CALCULAR LA RAIZ DE UN NUMERO NEGATIVO");
        }
        else
        {
            raiz=Math.sqrt(radicando);
            System.out.println("LA RAIZ CUADRADA DEL NUMERO ES DE "+raiz);
        }
    }
}
