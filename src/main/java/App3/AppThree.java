package App3;

import java.util.Scanner;

public class AppThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14;
        System.out.println("Ingrese el radio del circulo : ");
        double radio = scanner.nextDouble();

        double area = Math.pow(radio,2)* pi;
        double circunferencia = 2*pi*radio;

        System.out.println("La circunferencia es : "+circunferencia);
        System.out.println("El área del circulo es : "+area);

    }
}
