package tareaproclase;

import static java.lang.Math.abs;

public class MyLittleDecimal {
    int noomeroo;
    MyLittleDecimal(String numuru){
        numuru=numuru.replaceAll(",","");
        this.noomeroo=Integer.parseInt(numuru);
    }
    int getValor(){
        return this.noomeroo;
    }
    public String deINTaFdouble(int noomeroo){
        String loziuwu=String.valueOf(noomeroo);
        if (noomeroo==0){
            return "0,00";
        }
        if (noomeroo<0 && loziuwu.length()==3){
            noomeroo=noomeroo*-1;
            return "-0,"+noomeroo;
        }
        if (noomeroo<0 && loziuwu.length()==2){
            noomeroo=noomeroo*-1;
            return "-0,0"+noomeroo;
        }
        if (noomeroo>0 && loziuwu.length()==1){
            return "0,0"+noomeroo;
        }
        if (noomeroo>0 && loziuwu.length()==2){
            return "0,"+loziuwu;
        }
        String lozizizi=",";
        loziuwu=loziuwu.substring(0,loziuwu.length()-2)+lozizizi+loziuwu.substring(loziuwu.length()-2);
        return loziuwu;
    }
    @Override
    public String toString() {
        return deINTaFdouble(this.noomeroo);
    }
    MyLittleDecimal sumar(MyLittleDecimal cum){
        int result = this.noomeroo+cum.noomeroo;

        return new MyLittleDecimal(deINTaFdouble(result));
    }
    MyLittleDecimal restar(MyLittleDecimal cum){
        int result=this.noomeroo-cum.noomeroo;
        if (this.noomeroo==cum.noomeroo){
            return new MyLittleDecimal("000");
        } else return new MyLittleDecimal(deINTaFdouble(result));
    }
    MyLittleDecimal multiplicar(MyLittleDecimal cum){
        int result2 = this.noomeroo*cum.noomeroo;
        int result = result2/100;
        return new MyLittleDecimal(deINTaFdouble(result));
    }
    MyLittleDecimal dividir(MyLittleDecimal cum){
        int result=(this.noomeroo*100)/cum.noomeroo;
        return new MyLittleDecimal(deINTaFdouble(result));
    }

    public static void main(String[] args) {
        MyLittleDecimal mld1 = new MyLittleDecimal("8,00");
        MyLittleDecimal mld2 = new MyLittleDecimal("-1,25");
        MyLittleDecimal mld3=mld1.multiplicar(mld2);
        System.out.println(mld3.getValor());
        System.out.println(mld3);
    }
}
