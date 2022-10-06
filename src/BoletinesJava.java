import java.util.Scanner;
public class BoletinesJava {
    public static void caso1(){
        System.out.println("Dame un Double: ");
        Scanner numerito= new Scanner(System.in);
        double d= Double.parseDouble(String.valueOf(numerito.nextInt()));
        int i=(int)d;
        System.out.println(i);
    }
    public static void caso2(){
        System.out.println("Dame un Int: ");
        Scanner numerito= new Scanner(System.in);
        int d= Integer.parseInt(String.valueOf(numerito.nextInt()));
        double i=(double)d;
        System.out.println(i);
    }
    public static void caso3(){
        System.out.println("Dame un Int: ");
        Scanner numerito= new Scanner(System.in);
        int d= Integer.parseInt(String.valueOf(numerito.nextInt()));
        short i=(short) d;
        System.out.println(i);
    }
    public static void caso4(){
        System.out.println("Dame un Short: ");
        Scanner numerito= new Scanner(System.in);
        short d= Short.parseShort(String.valueOf(numerito.nextInt()));
        int i=(int) d;
        System.out.println(i);
    }

    public static void test(){
        System.out.println("DIME UN NUMERO");
        Scanner uwu=new Scanner(System.in);
        System.out.println(uwu);
    }

    public static void cambiodetipos(){
        System.out.println("""
                1. Cambiar de double a int
                2. Cambiar de Int a double
                3. Cambiar de int a short\040
                4. Cambiar de short a int\s""");
        System.out.println("Digame que quiere hacer caballero: ");
        Scanner cositas= new Scanner(System.in);
        String cosotas = String.valueOf(cositas.nextInt());
        switch (cosotas){
            case "1"->caso1();
            case "2"->caso2();
            case "3"->caso3();
            case "4"->caso4();

        }
    }



    public static void main(String[] args) {
        System.out.println("Digame que boletin desea: ");
        Scanner numerito= new Scanner(System.in);
        String numeritote= String.valueOf(numerito.nextInt());
        switch (numeritote) {
            case "1" -> System.out.println("Hola");
            case "2" -> System.out.println("UWU");
            case "3" -> cambiodetipos();
            case "4" -> test();
            default -> throw new IllegalStateException("Unexpected value: " + numerito);
        }
    }
}
