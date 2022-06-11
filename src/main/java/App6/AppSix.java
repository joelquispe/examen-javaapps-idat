package App6;

import java.util.Scanner;

public class AppSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número decimal: ");
        double numberone = scanner.nextDouble();
        System.out.println("Ingrese el segundo número decimal: ");
        double numbertwo = scanner.nextDouble();
        double result = numberone * numbertwo;

        System.out.println("La multiplicación de decimales es : "+result );

    }
}
