package App5;

import java.util.Scanner;

public class AppFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número : ");
        double numero = scanner.nextDouble();

        if(numero % 2 == 0){
            System.out.println("El número "+numero+ " es par");
        }else{
            System.out.println("El número "+numero+" es impar");
        }
    }
}
