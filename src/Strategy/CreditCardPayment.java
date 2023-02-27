package Strategy;

import java.util.Scanner;

public class CreditCardPayment implements PaymentStrategy{
    int numeroT;
    int codeT;
    String fechaCT;

    public CreditCardPayment(int numeroT, int codeT, String fechaCT) {
        this.numeroT = numeroT;
        this.codeT = codeT;
        this.fechaCT = fechaCT;
    }

    @Override
    public String toString() {
        return "CreditCardPayment" +
                "numeroT=" + numeroT +
                ", codeT=" + codeT +
                ", fechaCT='" + fechaCT + '\'';
    }

    @Override
    public boolean pay() {
        Scanner sc = new Scanner(System.in);
        try{
            int num= sc.nextInt();
            int code= sc.nextInt();
            String fech =sc.nextLine();
            CreditCardPayment credit = new CreditCardPayment(num, code, fech);
            System.out.println(credit);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}

