 package proekt12;

import java.util.Scanner;

public class c_vo_f{

    public static void main (String[] args)
{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vnesete temperatura vo celzius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (9.0/5.0) * celsius + 32.0;

        System.out.println("Temperaturata vo farenhajt e : " + fahrenheit);
    }
}