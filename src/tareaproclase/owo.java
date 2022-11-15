package tareaproclase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class owo {
    public static void main(String[]args){
        List<caso> lista=new ArrayList<>();
        System.out.println("Dime tu nombre: ");
        Scanner ole = new Scanner(System.in);
        String olee= ole.nextLine();
        System.out.println("Dime tu Dni: (Sin letra) ");
        Scanner oleee = new Scanner(System.in);
        int oleeee= Integer.parseInt(oleee.nextLine());
        lista.add(new caso(olee, oleeee));
        lista.add(new caso("pepe", 45983421));
        lista.add(new caso("pepe", 45983421));
        lista.add(new caso("pepe", 45983421));

        for (caso caso: lista){
            System.out.println(caso.nombre +" "+caso.dni);
        }
    }
}
