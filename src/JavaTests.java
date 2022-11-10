import java.util.Scanner;

public class JavaTests {
    public static void main(String[] args) {
        double altura;
        double peso;
        Scanner uwu= new Scanner(System.in);
        Scanner owo= new Scanner(System.in);
        double uwunt= uwu.nextDouble();
        double owont= owo.nextDouble();
        double pito=uwunt/(owont*100);
        if (pito<18.5){
            System.out.println("Delgado");
        } else if (pito >=18.5 || pito <=24.9) {
            System.out.println("Normal");
        } else if (pito>24.9 || pito <=29.9) {
            System.out.println("Sobrepeso");
        }else System.out.println("Obeso");
    }

}
