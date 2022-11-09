import java.util.Scanner;

public class JavaTests {
    public static void main(String[] args) {
        Scanner uwu = new Scanner(System.in);
        String[] owo = uwu.nextLine().split(" ");
        String comidadiaria=owo[0];
        String animales=owo[1];
        String kilosdiarios=owo[2];
        double uwu1=Double.parseDouble(comidadiaria);
        double uwu2=Double.parseDouble(animales);
        double uwu3=Double.parseDouble(kilosdiarios);
        double necesaria=uwu2*uwu3;
        double pito=uwu1-necesaria;
        if (uwu1<necesaria){
            System.out.println("Ración: "+necesaria/uwu1+" Kg");
        }else System.out.println("Excedente: "+pito);

    }

}
