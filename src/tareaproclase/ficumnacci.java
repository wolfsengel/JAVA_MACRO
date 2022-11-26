package tareaproclase;

public class ficumnacci {
    public static int fibonacci(int hastadondemivida){
        int estees=0;
            if (hastadondemivida==0){
                return 0;
            }else if(hastadondemivida==1){
                return 1;
            }else{
                estees=fibonacci(hastadondemivida-1)+fibonacci(hastadondemivida-2);
            }
        return estees;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(3));
    }
}
