import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Objects;

public class MyLittleDecimal {
    int noomeroo;
    MyLittleDecimal(String numuru){
        numuru=numuru.replaceAll(",",".");
        double numuruwu=Double.parseDouble(numuru);
        this.noomeroo= (int) (numuruwu*100);
    }
    int getValor(){
        return Integer.parseInt(String.valueOf(noomeroo));
    }
    @Override
    public String toString() {
        double pedo = Double.parseDouble(String.valueOf(noomeroo))/100;
        String[] resultado= resultado.toArray();
        resultado= String.valueOf(resultado.toCharArray());
        String[] resooltado = resultado;
        if (Objects.equals(resooltado[resooltado.length-1], ",")){
            DecimalFormat df = new DecimalFormat("#.00");
            resultado=df.format(resultado);
            resultado=resultado.replaceAll("\\.",",");
            return  resultado;
        }else{
            resultado=resultado.replaceAll("\\.",",");
            return resultado;
        }

    }
    MyLittleDecimal sumar(MyLittleDecimal cum){
        double noomeroo1 = this.noomeroo;
        double noomeroo2 = cum.noomeroo;

        return new MyLittleDecimal(String.valueOf((noomeroo1+noomeroo2)/100));
    }
    MyLittleDecimal restar(MyLittleDecimal cum){
        double noomeroo1 = this.noomeroo;
        double noomeroo2 = cum.noomeroo;
        return new MyLittleDecimal(String.valueOf((noomeroo1-noomeroo2)/100));
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
        MyLittleDecimal owo=new MyLittleDecimal("210.11");
        System.out.println(owo);
        MyLittleDecimal pollo=owo.sumar(owo);
        System.out.println(pollo);
        pollo=owo.restar(owo);
        System.out.println(pollo);
        pollo=owo.multiplicar(owo);
        System.out.println(pollo);
        MyLittleDecimal uwu=new MyLittleDecimal("30.45");
        int penenene=uwu.getValor();
        System.out.println(penenene);
    }
}
