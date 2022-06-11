package App4;

import java.util.ArrayList;
import java.util.Scanner;

public class AppFour {
    static ArrayList<Automovil> automoviles = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer id = (int)(Math.random()*100) ;

        String capacidadllenado;
        String marca;
        String modelo ;
        String ano;
        int option;

        do {
            System.out.println("Ingrese una opción : 1=Crear vehiculo.  2=Salir");
            option = scanner.nextInt();
            if(option == 1){
                System.out.println("Escribir marca: ");
                marca = scanner.next();
                System.out.println("Escribir modelo: ");
                modelo = scanner.next();
                System.out.println("Escribir año: ");
                ano = scanner.next();
                System.out.println("Escribir capacidad de llenado: ");
                capacidadllenado = scanner.next();

                createAutomovil(id,marca,modelo,ano,capacidadllenado);
                System.out.println("Auto creado......");
                showAutomoviles();
            }else if(option == 2){
                System.out.println("Saliendo del sistema");
                break;
            }else{
                System.out.println("Saliendo del sistema... No existe esa opción");
                break;
            }
            System.out.println(option);
        }while(option == 1);


    }
    static void createAutomovil(Integer id,String capacidad,String marca, String modelo, String ano){
        automoviles.add(new Automovil(id,capacidad,marca,modelo,ano));
    }

    static void showAutomoviles(){
        for(Automovil auto : automoviles){
            System.out.println("Id: "+ auto.getId());
            System.out.println("Marca: "+auto.getMarca());
            System.out.println("Modelo: "+auto.getModelo());
            System.out.println("Año: "+auto.getAno());
            System.out.println("Capcidad de llenado: "+auto.getCapacidadllenado());
        }
    }
}
