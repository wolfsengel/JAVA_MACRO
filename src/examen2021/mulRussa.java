package examen2021;

public class mulRussa {
    public static int mulRusa(int a, int b){
        int[] div = new int[15];
        int[] mult = new int[15];
        int i=0;
        do {
            div[i] = b;
            b = b / 2;
            i++;
        } while (b != 0);
        int j=0;
        do {
            mult[j] = a;
            a = a * 2;
            j++;
        } while (j<i);
        int suma=0;
        for (int h=0;h<div.length;h++){
            if (div[h]%2!=0){
                suma+=mult[h];
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println(mulRusa(1999,33));
    }
}
