package examen2021;

import java.util.Scanner;

public class Pizzas {
    public static void main(String[] args) {
        Scanner uwu = new Scanner(System.in);
        while (true){
            int piiccocks=uwu.nextInt();

            if (piiccocks==0){
                return;
            }
            int persianas= uwu.nextInt();
            if (persianas%piiccocks!=0){
                System.out.println("PELEA");
            }else System.out.println(persianas/piiccocks);
        }
    }
}
