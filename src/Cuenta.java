public class Cuenta {
double saldo;
String nombre;
String telefono;
Cuenta(String Telefono,String Nombre,double Saldo){
    this.telefono=Telefono;
    this.nombre=Nombre;
    this.saldo=Saldo;
}
Cuenta() {

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
    private void setSaldo(double Saldo){
    saldo=Saldo;
    }
    private double getSaldo() {
    return saldo;
    }


}

