package App2;

import java.util.Scanner;

public class AppTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número para elevar al cuadrado : ");
        double number = scanner.nextDouble();

        System.out.println("El número "+number+"al cuadrado es :"+ Math.pow(number,2));
    }
}
