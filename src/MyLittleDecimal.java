import java.util.Objects;

import static java.lang.Math.abs;

public class MyLittleDecimal {
    int noomeroo;
    MyLittleDecimal(String numuru){
        numuru=numuru.replaceAll(",",".");
        double numuruwu=Double.parseDouble(numuru);
        this.noomeroo= (int) (numuruwu*100);
    }
    int getValor(){
        return this.noomeroo;
    }
    public String deINTaFdouble(int noomeroo){
        if (noomeroo==0){
            return "0,00";
        }
        String num=noomeroo+" ";
        String[] ary= num.split("");
        if (Objects.equals(ary[0], "-")){
            num=num.replaceAll("-","");
            ary= num.split("");
        }
        if (ary.length==2){
            if (noomeroo<0){
                noomeroo=abs(noomeroo);
                String num2="00"+noomeroo+"0";
                String[] ary2= num2.split("");
                ary2[ary2.length-1]=ary2[ary2.length-2];
                ary2[ary2.length-2]=ary2[ary2.length-3];
                ary2[ary2.length-3]=",";
                return "-"+String.join("", ary2);
            }
            String num2="00"+noomeroo+"0";
            String[] ary2= num2.split("");
            ary2[ary2.length-1]=ary2[ary2.length-2];
            ary2[ary2.length-2]=ary2[ary2.length-3];
            ary2[ary2.length-3]=",";
            return String.join("", ary2);
        }
        if (ary.length==3){
            if (noomeroo<0){
                noomeroo=abs(noomeroo);
                String num2="0"+noomeroo+"0";
                String[] ary2= num2.split("");
                ary2[ary2.length-1]=ary2[ary2.length-2];
                ary2[ary2.length-2]=ary2[ary2.length-3];
                ary2[ary2.length-3]=",";
                return "-"+String.join("", ary2);
            }
            String num2="0"+noomeroo+"0";
            String[] ary2= num2.split("");
            ary2[ary2.length-1]=ary2[ary2.length-2];
            ary2[ary2.length-2]=ary2[ary2.length-3];
            ary2[ary2.length-3]=",";
            return String.join("", ary2);
        }
        ary[ary.length-1]=ary[ary.length-2];
        ary[ary.length-2]=ary[ary.length-3];
        ary[ary.length-3]=",";
        if (noomeroo<0){
            return "-"+String.join("", ary);
        }else return String.join("", ary);
    }
    @Override
    public String toString() {
        return deINTaFdouble(this.noomeroo);
    }
    MyLittleDecimal sumar(MyLittleDecimal cum){
        double noomeroo1 = this.noomeroo;
        double noomeroo2 = cum.noomeroo;

        return new MyLittleDecimal(String.valueOf((noomeroo1+noomeroo2)/100));
    }
    MyLittleDecimal restar(MyLittleDecimal cum){
        double noomeroo1 = this.noomeroo;
        double noomeroo2 = cum.noomeroo;
        if (this.noomeroo==cum.noomeroo){
            return new MyLittleDecimal("000");
        } else return new MyLittleDecimal(String.valueOf((noomeroo1-noomeroo2)/100));
    }
    MyLittleDecimal multiplicar(MyLittleDecimal cum){
        double noomeroo1 = this.noomeroo;
        double noomeroo2 = cum.noomeroo;
        return new MyLittleDecimal(String.valueOf((noomeroo1*noomeroo2)/10000));
    }
    MyLittleDecimal dividir(MyLittleDecimal cum){
        double noomeroo1 = this.noomeroo;
        double noomeroo2 = cum.noomeroo;
        return new MyLittleDecimal(String.valueOf((noomeroo1*100/noomeroo2*100)/10000));
    }

    public static void main(String[] args) {
        MyLittleDecimal mld1 = new MyLittleDecimal("100,00");
        MyLittleDecimal mld2 = new MyLittleDecimal("300,00");
        MyLittleDecimal mld3=mld1.dividir(mld2);
        System.out.println(mld3);
    }
}
