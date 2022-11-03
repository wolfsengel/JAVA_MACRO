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
                        int croupier= (int) (Math.random() * (30-ojo))+ojo;
                        System.out.println("Tu tienes de suma: "+ojo+", y el croupier ha obtenido:"+croupier);
                        if (croupier>21){
                            System.out.println("GANASTE!!");
                            dineroactualizado=dineroactualizado+apuesta*2;
                        }else if(ojo<croupier){
                            System.out.println("Lo sentimos has perdido...");
                            dineroactualizado=dineroactualizado-apuesta;
                        }else{
                            System.out.println("GANASTE!!");
                            dineroactualizado=dineroactualizado+apuesta*2;

                        }
                        break;
                    }
                    }
                }
            }
            return dineroactualizado;

    }


    public static int poker(int dineroactualizado){
        System.out.println("Muy buena eleccion \n Selecciona cuanto quieres apostar: ");
        Scanner dinero = new Scanner(System.in);
        int apuesta = dinero.nextInt();
        System.out.println("Buena cantidad, ojo!");
        System.out.println("Procedemos a repartir las cartas!");
        while (true){

            carta tuya = new carta(coloraleatoria(),paloaleatoria(),cartaaleatoria());
            carta tuya2=new carta(coloraleatoria(),paloaleatoria(),cartaaleatoria());
            System.out.println("Dispones de: "+tuya.colorino+" "+tuya.palo+" "+tuya.numerino);
            System.out.println("y tambien dispones de: "+tuya2.colorino+" "+tuya2.palo+" "+tuya2.numerino);

            System.out.println("Repartimos las cartas sobre la mesa: ");
            carta mesa1 = new carta(coloraleatoria(),paloaleatoria(),cartaaleatoria());
            carta mesa2 = new carta(coloraleatoria(),paloaleatoria(),cartaaleatoria());
            carta mesa3 = new carta(coloraleatoria(),paloaleatoria(),cartaaleatoria());
            carta mesa4 = new carta(coloraleatoria(),paloaleatoria(),cartaaleatoria());
            carta mesa5 = new carta(coloraleatoria(),paloaleatoria(),cartaaleatoria());
            ArrayList<carta> mesota= new ArrayList<>();
            mesota.add(mesa1);
            mesota.add(mesa2);
            mesota.add(mesa3);
            mesota.add(mesa4);
            mesota.add(mesa5);
            for (Declaraciones.carta carta : mesota) {
                System.out.println(carta.numerino + " de " + carta.palo + " " + carta.colorino + " \n");
            }
            ArrayList<carta> oponente=new ArrayList<>();
            carta suya = new carta(coloraleatoria(),paloaleatoria(),cartaaleatoria());
            carta suya2=new carta(coloraleatoria(),paloaleatoria(),cartaaleatoria());
            int puntuacion=0;
            String que;
            for (Declaraciones.carta carta : mesota) {
                if (carta.numerino==tuya.numerino){
                    puntuacion=puntuacion+1;
                    if (carta.numerino==tuya2.numerino){
                        puntuacion=puntuacion+2;
                    }
                }
                if (carta.numerino==tuya2.numerino){
                    puntuacion=puntuacion+1;
                }
                switch (puntuacion){
                    case 1->{
                        que="pareja";
                        System.out.println("Tienes: "+que);
                        System.out.println("De "+suya.numerino);
                    }
                    case 2->{que="pareja";
                        System.out.println("Tienes: "+que);
                        System.out.println("De "+suya2.numerino);
                    }
                    case 3->{}
                    case 4->{que="trio";
                        System.out.println("Tienes: "+que);
                        System.out.println("De "+suya2.numerino);}
                }
            }
//---------------------------------
            int puntuacion2=0;
            String que2;
            for (Declaraciones.carta carta : mesota) {
                if (carta.numerino==suya.numerino){
                    puntuacion2=puntuacion2+1;
                    if (carta.numerino==suya2.numerino){
                        puntuacion2=puntuacion2+1;
                    }
                }
                if (carta.numerino==suya2.numerino){
                    puntuacion2=puntuacion2+2;
                }
                switch (puntuacion2){
                    case 1->{
                        que2="pareja";
                        System.out.println("El oponente tiene: "+que2);
                        System.out.println("De "+suya.numerino);
                    }
                    case 2->{que2="pareja";
                        System.out.println("El oponente tiene: "+que2);
                        System.out.println("De "+suya2.numerino);
                    }
                    case 3->{}
                    case 4->{que2="trio";
                        System.out.println("El oponente tiene: "+que2);
                        System.out.println("De "+suya2.numerino);}
                }
            }
            if (puntuacion==1||puntuacion2==1){
                if (tuya.numerino< suya.numerino){
                    dineroactualizado=dineroactualizado+apuesta;
                    return dineroactualizado;
                }
            }

            break;
        }
        return dineroactualizado;
    }

}
