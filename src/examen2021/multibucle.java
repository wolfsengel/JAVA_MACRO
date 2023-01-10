package examen2021;
public class multibucle {

    public static long mulRusa(long a, long b){
        long[] uwu = new long[100];
        int i=0;
        while(true){
            if (b%2!=0){
                uwu[i]=a;
            }
            a=a*2;
            b=b/2;
            if (b<=1){
                break;
            }
            i++;
        }
        long suma=0;
        for (long j:uwu){
            suma=suma+j;
        }
        return suma;
    }
    public static void main(String[] args) {
        System.out.println(mulRusa(1999,33));
    }
}
