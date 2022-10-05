import java.util.Scanner;
public class BoletinesJava {

    public void cambiodetipos(){

    }



    public static void main(String[] args) {
        System.out.println("Digame que boletin desea: ");
        Scanner numerito= new Scanner(System.in);
        String numeritote= String.valueOf(numerito.nextInt());
        switch (numeritote) {
            case "1" -> System.out.println("Hola");
            case "2" -> System.out.println("UWU");
            default -> throw new IllegalStateException("Unexpected value: " + numerito);
        }
    }
}
