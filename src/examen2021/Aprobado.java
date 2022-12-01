package examen2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Aprobado {
    public static void main(String[] args) {
        String[] linea1;
        Scanner sc = new Scanner(System.in);
        linea1=sc.nextLine().split(",");
        String[] linea2;
        linea2=sc.nextLine().split(",");

        int limite = sc.nextInt();
        int y=0;
        String[] finalist=new String[100];
        for (String value : linea2) {
            for (String s : linea2) {
                if (Integer.parseInt(value) + Integer.parseInt(s) < limite) {
                    finalist[y] = value;
                    finalist[y + 1] = s;
                    y++;
                }
            }
        }



    }
}
