package Casino;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
public class Declaraciones {

    static class usuario{
        String nombre;
        int dinero;
        usuario(String Nombre, int Dinero){
            this.nombre=Nombre;
            this.dinero=Dinero;
        }
    }
    static class carta{
        String colorino;
        String palo;
        int numerino;
        carta(String Colorino, String Palo, int Numerino){
            this.colorino=Colorino;
            this.palo=Palo;
            this.numerino=Numerino;
        }

    }
    public static int cartaaleatoria(){
        return (int) (Math.random() * 10) +1;
    }
    public static String paloaleatoria(){
        int owo= (int) (Math.random() * 4) +1;
        if (owo==1){
            return "Treboles";
        }else if (owo==2){
            return "Corazones";
        } else if (owo==3) {
            return "Picas";
        }else return "Diamantes";
    }
    public static String coloraleatoria(){
        int ewe= (int) (Math.random() * 2) +1;
        if (ewe==2)return "rojo";
        else return "negro";
    }

    public static int ruleta(int dineroactualizado){
        System.out.println("Muy buena eleccion \n Selecciona cuanto quieres apostar: ");
        Scanner dinero = new Scanner(System.in);
        int apuesta = dinero.nextInt();
        System.out.println("Buena cantidad, ojo!");

        System.out.println("Dime que color:(R o N) ");
        Scanner colorete = new Scanner(System.in);
        String colorete1 = colorete.nextLine();

        System.out.println("Dime que numero:(0 -- 31) ");
        Scanner numerete = new Scanner(System.in);
        int numerete1 = numerete.nextInt();


        String color;
        int uwu= (int) (Math.random() * 2) +1;
        if(uwu==2){
            color="N";
        }else{
            color="R";
        }
        int numero= (int) (Math.random() * 31) +1;


        if (Objects.equals(colorete1, color) || numerete1==numero){
            System.out.println("GANASTE QUE CABRON COMO LO HIZO???");
            System.out.println("Efectivamente era el: "+numerete1+" "+colorete1);
            dineroactualizado=dineroactualizado+apuesta*9;
        }else{
            dineroactualizado=dineroactualizado-apuesta;
            System.out.println("No acertaste :(");
            System.out.println("En realidad era el "+numero+" "+color);
        }
        System.out.println("Tu saldo es de: "+dineroactualizado);
return dineroactualizado;
    }

    public static int jackblack(int dineroactualizado){
        System.out.println("Muy buena eleccion \n Selecciona cuanto quieres apostar: ");
        Scanner dinero = new Scanner(System.in);
        int apuesta = dinero.nextInt();
        System.out.println("Buena cantidad, ojo!");
        ArrayList<Integer> mano= new ArrayList<>();
        carta carta1=new carta(coloraleatoria(),paloaleatoria(),cartaaleatoria());
        System.out.println("Te ha tocado: "+carta1.numerino+" de "+carta1.palo+" "+carta1.colorino);
        mano.add(carta1.numerino);
            System.out.println("""
                    Que deseas hacer?\040
                    1. Me quedo asi
                    2. Otra mas
                    0. Salir corriendo!!
                    """);
            Scanner teta=new Scanner(System.in);
            int teto=teta.nextInt();
            switch (teto){
                case 0->{
                    dineroactualizado=dineroactualizado-apuesta;
                    jackblack(dineroactualizado);
                }
                case 1->{}
                case 2->{
                    carta carta2;
                    while (true){
                    carta2=new carta(coloraleatoria(),paloaleatoria(),cartaaleatoria());
                    System.out.println("Te ha tocado: "+carta2.numerino+" de "+carta2.palo+" "+carta2.colorino);
                    mano.add(carta2.numerino);
                    int ojo=0;
                    for (Integer integer : mano) {
                        ojo = ojo + integer;
                    }
                    if (ojo==21){
                        System.out.println("GANASTE!!!!!!!");
                        dineroactualizado=dineroactualizado*10;
                    }else if(ojo>21){
                        System.out.println("Te pasaste de 21! Lo sentimos mucho... ha perdido");
                        dineroactualizado=dineroactualizado-apuesta;
                        System.out.println("Dispone de: "+dineroactualizado);
                        break;
                        }
                    System.out.println("Tu suma es: "+ojo);
                    System.out.println("Seguir?(si/no)");
                    Scanner aaa=new Scanner(System.in);
                    String aaaa=aaa.nextLine();
                    if (!Objects.equals(aaaa, "si")){
                        int croupier= (int) (Math.random() * 30) +1;
                        System.out.println("Tu tienes de suma: "+ojo+", y el croupier ha obtenido:"+croupier);
                        if (croupier>21){
                            System.out.println("GANASTE!!");
                            dineroactualizado=dineroactualizado+apuesta*2;
                            System.out.println("Dispone de: "+dineroactualizado);
                        }else if(ojo<croupier){
                            System.out.println("Lo sentimos has perdido...");
                            dineroactualizado=dineroactualizado-apuesta;
                            System.out.println("Dispone de: "+dineroactualizado);
                        }else{
                            System.out.println("GANASTE!!");
                            dineroactualizado=dineroactualizado+apuesta*2;
                            System.out.println("Dispone de: "+dineroactualizado);
                        }
                        break;
                    }
                    }
                }
            }
            return dineroactualizado;

    }

}
