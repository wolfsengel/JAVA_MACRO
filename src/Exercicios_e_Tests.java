public class Exercicios_e_Tests {

    public static class coche{
        String coche;
        int pasajeros;
        int deposito;
        int kpl;
        int autonomy(){
            return deposito*kpl;
        }
    }

    public static void main(String[] args) {
     coche golf= new coche();
     golf.kpl=20;
     golf.deposito=60;
     golf.pasajeros=5;
     golf.coche="Golf";

     System.out.print("Kpl: "+golf.kpl+", Deposito: "+golf.deposito+", Pasajeros: "+golf.pasajeros+", Coche: "+ golf.coche+", Autonomia: "+golf.autonomy());
    }
}
