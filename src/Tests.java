import java.util.Scanner;
public class Tests {
        public static void main(String[] args) {
            int ubuntu;
            do {
                Scanner uwu = new Scanner(System.in);
                ubuntu = uwu.nextInt();
                Scanner lozano = new Scanner(System.in);
                int loci;
                int sum = 0;
                for (int i = 0; i < ubuntu; i++) {
                    loci = lozano.nextInt();
                    sum = loci + sum;
                }
                if (ubuntu != 0) {
                    System.out.println(sum);
                }

            } while (ubuntu != 0);

        }
}
