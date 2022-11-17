import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Tests {
        int noomeroo;
        Tests(){
                this.noomeroo=1004;
        }
        public String toString(){
                return deINTaFdouble(noomeroo);
        }
        public String deINTaFdouble(int noomeroo){
                String num=noomeroo+" ";
                String[] ary= num.split("");
                ary[ary.length-1]=ary[ary.length-2];
                ary[ary.length-2]=ary[ary.length-3];
                ary[ary.length-3]=",";

                return String.join("", ary);
        }
        public static void main(String[] args) {
                Tests uwu=new Tests();
                System.out.println(uwu);

                Tests owo;
                owo=uwu;
        }
}
