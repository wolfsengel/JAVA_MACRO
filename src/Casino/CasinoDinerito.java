package Casino;

import java.util.Scanner;

import static Casino.Declaraciones.*;

public class CasinoDinerito {
    public static void main(String[] args) {
       System.out.println("Bienvenido al CASINOOOOO! (--EMPIEZAS CON 1000 euros--)");
        System.out.println("Como te llamas?");
        Scanner nome = new Scanner(System.in);
        String Nombrecito = nome.nextLine();
        usuario persona1=new usuario(Nombrecito,1000);
        System.out.println("Enhorabuena! te llamas "+persona1.nombre+", Disfruta de la experiencia!");
       while (true){
           if (persona1.dinero<=0){
               System.out.println("Saldo insuficiente");
               return;
           }
           System.out.println("""
               Dime que juego quieres:\s
               1. Ruleta de la fortuna
               2. Poker
               3. BlackJack
               4. Salir
               """);
           Scanner selec = new Scanner(System.in);
           String selecc= selec.nextLine();
           switch (selecc){
               case "1"->ruleta(persona1.dinero);
               case "2"->jackblack(persona1.dinero);
               case "3"->{}
               case "4"-> {
                   System.out.println("VUELVE PRONTO!");
                   return;}
           }
       }


    }

}

