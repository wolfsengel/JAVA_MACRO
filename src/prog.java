import java.util.*;
public class prog{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] num1=new String[3];
        String[] num2=new String[3];
        String nums=sc.nextLine();
        nums= nums.replaceAll(" ","");
        String[] num= nums.split("");
        while(Integer.parseInt(num[0])!=0 && Integer.parseInt(num[2])!=0){

        for (int i=0;i<3;i++){
            num1[i]=num[i];
        }
        for (int i=0;i<3;i++){
            num2[i]=num[i+2];
        }
        int cont=0;
        for (int i=0;i<3;i++){
            if ( Integer.parseInt(num1[i]) +Integer.parseInt(num2[i])>9){
                cont++;
            }
        }
        System.out.println(cont);
        }
    }
}