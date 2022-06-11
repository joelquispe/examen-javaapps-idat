package App1;

import java.util.Scanner;

public class AppOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre : ");
        String name = scanner.next();
        System.out.println("Ingrese su habilidad : ");
        String skill = scanner.next();

        System.out.println(name +" es " +skill);

    }
}
