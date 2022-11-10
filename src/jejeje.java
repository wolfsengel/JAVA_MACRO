import java.util.Scanner;

public class jejeje {
    public static void main(String[] args) {
        Scanner lozano = new Scanner(System.in);
        String[] lozi = lozano.nextLine().split(" ");
        double ms = Double.parseDouble(lozi[0]);
        double velmax = Double.parseDouble(lozi[1]);
        double sec = Double.parseDouble(lozi[2]);
        double mpsoptimo = velmax*0.277777778;
        double mpsdelchaval = ms/sec;
        double veintepor=mpsoptimo*20/100;
        if (ms==0 && velmax==0 && sec==0) {}else if ((ms == 0 && velmax > 0 && sec == 0)||(ms<0&&velmax<0&&sec<0)) {
            System.out.println("ERROR");
        }else{
                if (mpsdelchaval < mpsoptimo) {
                    System.out.println("OK");
        } else if (mpsdelchaval > mpsoptimo && mpsdelchaval - mpsoptimo < veintepor) {
            System.out.println("MULTA");
        } else if (mpsdelchaval > mpsoptimo && mpsdelchaval - mpsoptimo >= veintepor) {
            System.out.println("PUNTOS");
        } else System.out.println("ERROR");
            }
    }
}
