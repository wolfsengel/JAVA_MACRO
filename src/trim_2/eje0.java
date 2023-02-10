package trim_2;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class eje0 {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[] text = sc.nextLine().split("");
        char[][] a={{' ','#','#','#','#',' '},
                {' ','#',' ',' ','#',' '},
                {' ','#','#','#','#',' '},
                {' ','#',' ',' ','#',' '},
                {' ','#',' ',' ','#',' '},};
        char[][] e={{' ','#','#','#','#',' '},
                {' ','#',' ',' ',' ',' '},
                {' ','#','#','#','#',' '},
                {' ','#',' ',' ',' ',' '},
                {' ','#','#','#','#',' '},};
        char[][] i={{' ',' ',' ','#',' ',' '},
                {' ',' ',' ','#',' ',' '},
                {' ',' ',' ','#',' ',' '},
                {' ',' ',' ','#',' ',' '},
                {' ',' ',' ','#',' ',' '},};
        char[][] c={{' ','#','#','#','#','#'},
                {' ','#',' ',' ',' ',' '},
                {' ','#',' ',' ',' ',' '},
                {' ','#',' ',' ',' ',' '},
                {' ','#','#','#','#','#'},};
        char[][] d={{' ','#','#',' ',' ',' '},
                {' ','#',' ','#',' ',' '},
                {' ','#',' ',' ','#',' '},
                {' ','#',' ','#',' ',' '},
                {' ','#','#',' ',' ',' '},};
        char[][] m={{' ','#',' ',' ',' ','#',' '},
                {' ','#','#',' ','#','#',' '},
                {' ','#',' ','#',' ','#',' '},
                {' ','#',' ',' ',' ','#',' '},
                {' ','#',' ',' ',' ','#',' '},};
        char[][] s={{' ','#','#','#','#','#'},
                {' ','#',' ',' ',' ',' '},
                {' ','#','#','#','#','#'},
                {' ',' ',' ',' ',' ','#'},
                {' ','#','#','#','#','#'},};
        char[][] t={{' ','#','#','#','#','#',' '},
                {' ',' ',' ','#',' ',' ',' '},
                {' ',' ',' ','#',' ',' ',' '},
                {' ',' ',' ','#',' ',' ',' '},
                {' ',' ',' ','#',' ',' ',' '},};
        char[][] o={{' ','#','#','#','#',' '},
                {' ','#',' ',' ','#',' '},
                {' ','#',' ',' ','#',' '},
                {' ','#',' ',' ','#',' '},
                {' ','#','#','#','#',' '},};
        char[][] nada={{' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' '},};
        char[][] l={{' ','#',' ',' ',' ',' '},
                {' ','#',' ',' ',' ',' '},
                {' ','#',' ',' ',' ',' '},
                {' ','#',' ',' ',' ',' '},
                {' ','#','#','#','#',' '},};

        for (int eje=0;eje<5;eje++){
            for (int uwu=0;uwu < text.length;uwu++){
                if (Objects.equals(text[uwu], "A")){
                    for (int q=0;q< a[eje].length;q++){
                        System.out.print(a[eje][q]);
                    }
                }

                if (Objects.equals(text[uwu], "E")){
                    for (int q=0;q< e[eje].length;q++){
                        System.out.print(e[eje][q]);
                    }
                }

                if (Objects.equals(text[uwu], "I")){
                    for (int q=0;q< i[eje].length;q++){
                        System.out.print(i[eje][q]);
                    }
                }
                if (Objects.equals(text[uwu], "O")){
                    for (int q=0;q< o[eje].length;q++){
                        System.out.print(o[eje][q]);
                    }
                }
                if (Objects.equals(text[uwu], "D")){
                    for (int q=0;q< d[eje].length;q++){
                        System.out.print(d[eje][q]);
                    }
                }
                if (Objects.equals(text[uwu], "M")){
                    for (int q=0;q< m[eje].length;q++){
                        System.out.print(m[eje][q]);
                    }
                }
                if (Objects.equals(text[uwu], "S")){
                    for (int q=0;q< s[eje].length;q++){
                        System.out.print(s[eje][q]);
                    }
                }
                if (Objects.equals(text[uwu], "T")){
                    for (int q=0;q< t[eje].length;q++){
                        System.out.print(t[eje][q]);
                    }
                }
                if (Objects.equals(text[uwu], "C")){
                    for (int q=0;q< c[eje].length;q++){
                        System.out.print(c[eje][q]);
                    }
                }
                if (Objects.equals(text[uwu], " ")){
                    for (int q=0;q< nada[eje].length;q++){
                        System.out.print(nada[eje][q]);
                    }
                }
                if (Objects.equals(text[uwu], "L")){
                    for (int q=0;q< l[eje].length;q++){
                        System.out.print(l[eje][q]);
                    }
                }


            }
            System.out.println();
        }
    }
}
