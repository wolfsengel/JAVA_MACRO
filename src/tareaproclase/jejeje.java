package tareaproclase;

import java.util.Scanner;

public class jejeje {
    public static void main(String[] args) {
        while (true) {
            Scanner uwu = new Scanner(System.in);
            int uwuntu = uwu.nextInt();
            Scanner lozano = new Scanner(System.in);
            int lozi = 0;
            int sum = 0;
            for (int i = 0; i < uwuntu; i++) {
                lozi = lozano.nextInt();
                sum = lozi + sum;
            }
            System.out.println(sum);
        }
    }
}
