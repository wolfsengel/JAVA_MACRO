import java.util.Scanner;

public class prog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String numero1 = scanner.next();
            String numero2 = scanner.next();

            if (numero1.equals("0") && numero2.equals("0")) {
                return;
            }

            int acarreo = 0;
            int count = 0;
            int i = 0;
            while (true) {
                int digit1 = i < numero1.length() ? numero1.charAt(numero1.length() - i - 1) - '0' : 0;
                int digit2 = i < numero2.length() ? numero2.charAt(numero2.length() - i - 1) - '0' : 0;
                acarreo = digit1 + digit2 + acarreo;
                if (acarreo > 9) {
                    count++;
                    acarreo = 1;
                } else {
                    acarreo = 0;
                }
                i++;
                if (acarreo==0 && (i > numero1.length() - 1 || i > numero2.length() - 1)) {
                    break;
                }
            }

            System.out.println(count);
        }
    }
}