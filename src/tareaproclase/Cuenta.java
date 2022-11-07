package tareaproclase;

import java.util.Objects;

public class Cuenta {
    private double saldo;
    private final String titular;
    private final String numeroCuenta;
    Cuenta(String Telefono,String Nombre,double Saldo){
        this.numeroCuenta =Telefono;
        this.titular =Nombre;
        this.saldo=Saldo;
    }

    public Cuenta() {
        this.titular ="sin titular";
        this.saldo=0.0;
        this.numeroCuenta ="sin numero";
    }

    public String toString() {
        if (!Objects.equals(this.titular, "")){
            return "("+this.numeroCuenta +", "+this.titular +", "+this.saldo+")";
        }else return "0.0";
    }

    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("111-222", "Epi", 50.0);
        System.out.println("el saldo inicial de Epi es: " + c1.getSaldo());
        //---------------------
        Cuenta c2 = new Cuenta("999-888", "Blas", 100.0);
        System.out.println("Datos de la cuenta c2: " + c2);
        //--------------------
        c1 = new Cuenta("111-222", "Epi", 50.0);
        c1.setSaldo(250.0);
        System.out.println("el nuevo saldo de Epi es: " + c1.getSaldo());
        //------------------
        Cuenta c3 = new Cuenta();
        System.out.println("datos de cuenta creada sin parámetros: " + c3);
    }
    public void setSaldo(double Saldo){
        saldo=Saldo;
    }
    public double getSaldo() {
        return saldo;
    }


}

