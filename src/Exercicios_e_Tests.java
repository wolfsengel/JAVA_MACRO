public class Exercicios_e_Tests {

    public static class coche{
        String coche;
        int pasajeros;
        int deposito;
        int kpl;
    }

    public static void main(String[] args) {
     coche golf= new coche();
     golf.kpl=20;
     golf.deposito=60;
     golf.pasajeros=5;
     golf.coche="Golf";
     int autonomia=60/20;
     System.out.println(golf.kpl+" "+golf.deposito+" "+golf.pasajeros+" "+ golf.coche+" "+autonomia);
    }
}
