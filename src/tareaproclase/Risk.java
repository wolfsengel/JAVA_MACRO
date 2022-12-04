package tareaproclase;



import java.util.Arrays;
import java.util.Scanner;

public class Risk {
    public static void sort(int[] list){
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                int temp;
                if (list[j] > list[i]) {
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {

            int[] lin1 = new int[5];
            for (int i = 0; i < 5; i++) {
                lin1[i] = sc.nextInt();
            }
            int td = lin1[0];
            int ta = lin1[1];
            int dd = lin1[2];
            int da = lin1[3];
            int no = lin1[4];
            int[] defence = new int[td];
            int[] attack = new int[ta];

            for (int i = 0; i < td; i++) {
                defence[i] = sc.nextInt();
            }
            sort(defence);
            for (int i = 0; i < ta; i++) {
                attack[i] = sc.nextInt();
            }
            sort(attack);
            int ata;
            int k = 0;
            ata = Math.min(attack.length, defence.length);
            while (k < no){
                for (int i = 0; i < ata; i++) {
                    if (attack[i] < defence[i]) {
                        attack[i] = 0;
                    } else if (defence[i] < attack[i]) {
                        defence[i] = 0;
                    } else if (defence[i] == attack[i]) {
                        attack[i] = 0;
                    }
                }
                System.out.println(Arrays.toString(defence));
                System.out.println(Arrays.toString(attack));
                for (int j = 0; j < attack.length; j++) {
                    if (attack[j] == 0 && da>0) {
                        attack[j] = sc.nextInt();
                        da--;
                    }
                }
                for (int j = 0; j < defence.length; j++) {
                    if (attack[j] == 0 && dd>0) {
                        attack[j] = sc.nextInt();
                        dd--;
                    }
                }
                sort(defence);
                sort(attack);
                k++;
            }
            System.out.println(Arrays.toString(defence));
            System.out.println(Arrays.toString(attack));

            int defc=td,attc=ta;
            for (int i : attack) {
                if (i != 0) {
                    attc--;
                }
            }
            for (int i : defence) {
                if (i != 0) {
                    defc--;
                }
            }
            System.out.println(defc+" "+attc);
        }

    }
}
