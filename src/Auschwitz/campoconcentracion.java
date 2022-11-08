package Auschwitz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class campoconcentracion {

    public static void main(String[] args) {
        while (true){
        System.out.println("\nBienvenido al sistema de presos del Campo De Concentracion de Auschwitz!");
        System.out.println("Por favor indica que accion quieres realizar: ");
        System.out.println("\n 1. Registrar interno\n 2. Eliminar interno \n 3. Ver internos \n 4. Salir");
        Scanner uwu = new Scanner(System.in);
        String owo = uwu.nextLine();
        ArrayList<String> delitinos = new ArrayList<>();
        switch (owo) {
            case "1" -> {

                System.out.println("Maravillosa eleccion!\n Digame el nombre del afortunado: ");
                Scanner uwu1 = new Scanner(System.in);
                String owo1 = uwu1.nextLine();

                System.out.println("\n Digame el Id del afortunado: ");
                Scanner uwu2 = new Scanner(System.in);
                int owo2 = Integer.parseInt(uwu2.nextLine());

                System.out.println("\n Digame los anos de condena del afortunado: ");
                Scanner uwu3 = new Scanner(System.in);
                int owo3 = Integer.parseInt(uwu3.nextLine());

                System.out.println("Digame los delitos del afortunado: ");
                Scanner uwu4 = new Scanner(System.in);

                String owo4= Arrays.toString(uwu4.nextLine().split(" "));
                delitinos.add(owo4);

                declaraciones.register(owo1,owo2,owo3,delitinos);
            }
            case "2" -> {
                System.out.println("Ha decidido eliminar a un interno!\nIndique el ID del susodicho: ");
                Scanner pito=new Scanner(System.in);
                int pitodos= pito.nextInt();
                for (int i=0;i<declaraciones.Internos.size();i++){
                    if (declaraciones.Internos.get(i).numID==pitodos){
                        declaraciones.Internos.remove(i);
                        System.out.println("Eliminado de manera segura!");
                    }
                }
            }
            case "3" -> {
                for (int i=0;i<declaraciones.Internos.size();i++){
                    System.out.println(declaraciones.Internos.get(i));
                    /*System.out.println("Nombre: "+declaraciones.Internos.get(i).nombre);
                    System.out.println("ID: "+declaraciones.Internos.get(i).numID);
                    System.out.println("Anos Condena: "+declaraciones.Internos.get(i).anoscondena);
                    System.out.println("Delitos: "+declaraciones.Internos.get(i).delitos);*/
                }
            }
            case "4" -> {
                return;
            }
        }

    }

}
}

