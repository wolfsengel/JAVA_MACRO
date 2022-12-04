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
        ArrayList<int[]> finalist= new ArrayList<>();
        for (int i=0;i< linea2.length;i++) {
            for (int j=0;j<linea2.length;j++) {
                if (Integer.parseInt(linea2[i]) + Integer.parseInt(linea2[j]) <= limite) {
                   finalist.add(new int[]{i,j});
                }
            }
        }
        for (int m=0;m< finalist.size();m++){
            for (int q=0;q< finalist.size();q++){
                if (finalist.get(m)[1]==finalist.get(q)[0] && finalist.get(m)[0]==finalist.get(q)[1]){
                    finalist.remove(q);
                }
            }
        }
        System.out.println("Combinaciones <= "+limite+" horas");
        System.out.println("--------------------------");
        int sum;
        for (int[] uwu : finalist){
            sum = Integer.parseInt(linea2[uwu[0]]) + Integer.parseInt(linea2[uwu[1]]);
            System.out.println(linea1[uwu[0]]+","+linea1[uwu[1]]+": "+sum+" horas");
        }
    }
}
