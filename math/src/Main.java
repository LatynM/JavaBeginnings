import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

    Scanner s = new Scanner(System.in);
    int sum;
	int a;
    int b;

    System.out.println("INGRESE PRIMER NUMERO >");
    a=s.nextInt();
    System.out.println("INGRESE SEGUNDO NUMERO >");
    b=s.nextInt();
    sum=a+b;

    if (sum==100)
    {
        System.out.println("IGUAL A 100");
    }
    else
    {
        if(sum>100)
        {
            System.out.println("MAYOR A 100");
        }
        else
        {
            System.out.println("MENOR A 100");
        }
    }

    int i,loop=4;
    int [] array = new int [loop];

    for(i=0;i<loop;i++)
    {
        array[i]=s.nextInt();
    }

        for(i=0;i<loop;i++)
        {
            System.out.println(array[i]);
        }

    System.out.println(sum);










    }
}
