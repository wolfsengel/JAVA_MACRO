package Examen2022;

abstract class Dinero {
    String pais;
    int dinero;
    char simbolo;

    public abstract char getSimbolo();

    @Override
    public String toString() {
        return dinero+""+simbolo;
    }

    public static Dinero getInstance(int Dinero, String pais) {
        switch (pais) {
            case "España" :
            case "Portugal" :
            case "Italia" : {
                return new Dineroeuropa(Dinero,pais);
            }
            default : {
                return new Dinerootro(Dinero,pais);
            }
        }
    }


}
class main{
    public static void main(String[] args) {
        Dinero dinero= Dinero.getInstance(500,"Perú");
        System.out.println(dinero.getSimbolo());
        System.out.println(dinero);
    }
}

class Dineroeuropa extends Dinero {
Dineroeuropa(int dinero, String pais){
    this.dinero=dinero;
    this.pais=pais;
    this.simbolo=getSimbolo();
}
    @Override
    public char getSimbolo() {
        return '€';
    }
}

class Dinerootro extends Dinero{
Dinerootro(int dinero, String pais){
    this.dinero=dinero;
    this.pais=pais;
    this.simbolo=getSimbolo();
}
    @Override
    public char getSimbolo() {
        return '$';
    }
}