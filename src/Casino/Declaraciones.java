package Casino;

import java.util.Objects;
import java.util.Scanner;
public class Declaraciones {

    static class usuario{
        String nombre;
        int dinero;
        usuario(String Nombre, int Dinero){
            this.nombre=Nombre;
            this.dinero=Dinero;
        }
    }
    public static void ruleta(int dineroactualizado){
        System.out.println("Muy buena eleccion \n Selecciona cuanto quieres apostar: ");
        Scanner dinero = new Scanner(System.in);
        int apuesta = dinero.nextInt();
        System.out.println("Buena cantidad, ojo!");

        System.out.println("Dime que color:(R o N) ");
        Scanner colorete = new Scanner(System.in);
        String colorete1 = colorete.nextLine();

        System.out.println("Dime que numero:(0 -- 31) ");
        Scanner numerete = new Scanner(System.in);
        int numerete1 = numerete.nextInt();


        String color;
        int uwu= (int) (Math.random() * 2) +1;
        if(uwu==2){
            color="NEGRO";
        }else{
            color="ROJO";
        }
        int numero= (int) (Math.random() * 31) +1;


        if (Objects.equals(colorete1, color) || numerete1==numero){
            System.out.println("GANASTE QUE CABRON COMO LO HIZO???");
            System.out.println("Efectivamente era el: "+numerete1+" "+colorete1);
            dineroactualizado=dineroactualizado*10;
        }else{
            dineroactualizado=dineroactualizado-apuesta;
            System.out.println("No acertaste :(");
        }
        System.out.println("Tu saldo es de: "+dineroactualizado);

    }
    public static void jackblack(int dineroactualizado){
        System.out.println("Muy buena eleccion \n Selecciona cuanto quieres apostar: ");
    }

}
