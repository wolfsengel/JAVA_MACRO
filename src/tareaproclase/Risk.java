package tareaproclase;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Risk {
    public static int[] sort(int[] list){
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
        return list;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] lin1=new int[5];
        for(int i=0;i<5;i++){
            lin1[i]=sc.nextInt();
        }
        int td=lin1[0];
        int ta=lin1[1];
        int dd=lin1[2];
        int da=lin1[3];
        int no=lin1[4];
        int[] defence = new int[td];
        int[] attack = new int[ta];
        int[] diceD = new int[dd];
        int[] diceA = new int[da];
        int[] waves = new int[no];

        for (int i = 0;i<td;i++){
            defence[i]=sc.nextInt();
        }
        sort(defence);
        for (int i = 0;i<ta;i++){
            attack[i]=sc.nextInt();
        }
        sort(attack);
        int ata = Math.min(attack.length, defence.length);
        for (int i=0;i<ata;i++){
            if (attack[i]<defence[i]){

            } else if (defence[i]<attack[i]) {
                
            }
        }
        System.out.println(Arrays.toString(defence));
        System.out.println(Arrays.toString(attack));
    }
}
