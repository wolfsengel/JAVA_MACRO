package tareaproclase;
import java.util.Objects;
import java.util.Scanner;

public class todio {
    public static void main(String[] args) {

        int t=0,e=0,o=0,d=0,i=0;
        Scanner uwu= new Scanner(System.in);
        String[] bloque=uwu.nextLine().split("");
        if (Objects.equals(bloque[0], "4")){
            System.out.println("SI");
            return;
        }
        //--------------------------------------------------------------------------------
        for (int j=0;j< bloque.length;j++) {
            if (Objects.equals(bloque[j], "t")){
                t+=1;
                for (int g=j;g< bloque.length;g++) {
                    if (Objects.equals(bloque[g], "e")){
                        e+=1;
                        for (int q=g;q< bloque.length;q++) {
                            if (Objects.equals(bloque[q], "o")){
                                o+=1;
                                for (int w=q;w< bloque.length;w++) {
                                    if (Objects.equals(bloque[w], "d")){
                                        d+=1;
                                        for (int m=w;m< bloque.length;m++) {
                                            if (Objects.equals(bloque[m], "t")){
                                                o+=1;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int j=0;j< bloque.length;j++) {
            if (!Objects.equals(bloque[j], "i")){
                bloque[j]="";
            }
        }
        //--------------------------------------------------------------------------------
        for (String s : bloque){
            System.out.print(s);
        }
    }
}
