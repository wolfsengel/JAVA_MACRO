package tareaproclase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Unidad3 {
    public static void main(String[] args){
        double salini = Double.parseDouble(args[0]);
        double pago=0;
        double sal=0;
        if (salini<2000){
            System.out.println("EXENTO");
            sal=salini-2000;
        }

        if (salini>2000 && salini<3000){
            pago=pago+sal*0.08;
            sal=sal-3000;
        }
        if (salini>3000 && salini<4500){
            pago=pago+sal*0.08;
            sal=sal-3000;
            pago=pago+sal*0.18;
            sal=sal-4500;
        }
        if (salini>4500){
            pago=pago+sal*0.08;
            sal=sal-3000;
            pago=pago+sal*0.18;
            sal=sal-4500;
            pago=pago+sal*0.08;
            sal=sal-3000;
        }


    }

}
