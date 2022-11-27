package tareaproclase;

public class Potencia{
    private final double real;
    private final int arriba;
    Potencia(double uwu, int aja){
        this.real=uwu;
        this.arriba =aja;
    }
    public Object multiplicarConIgualBase(Potencia p) {
        if (p.real!=this.real){
            return null;
        }
        int lolete=this.arriba +p.arriba;

        return new Potencia(this.real,lolete);
    }
    public double toReal(){
        return Math.pow(this.real,this.arriba);
    }
    @Override
    public String toString(){
        return this.real+"^"+this.arriba;
    }
    public static void main(String[] args) {
        Potencia p= new Potencia(2,3);
        System.out.println(p);
        System.out.println(p+"="+p.toReal());
        p= new Potencia(2,-3);
        System.out.println(p+"="+p.toReal());
        p= new Potencia(-2,-3);
        System.out.println(p+"="+p.toReal());
        p= new Potencia(2.5,2);
        System.out.println(p+"="+p.toReal());
        Potencia p1= new Potencia(2,3);
        Potencia p2= new Potencia(2,2);
        System.out.println("si multiplico con distinta base: "+p1.multiplicarConIgualBase(p));
        System.out.println(p1.multiplicarConIgualBase(p2));
    }
}