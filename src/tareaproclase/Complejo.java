package tareaproclase;

public class Complejo {
    private double real;
    private double img;
    Complejo(double real,double img){
        this.real=real;
        this.img=img;
    }
    Complejo(){
        this.real=0.0;
        this.img=0.0;
    }
    void setReal(double Real){
        this.real=Real;
    }
    void setImg(double Img){
        this.img=Img;
    }

    public double getImg() {
        return img;
    }

    public double getReal() {
        return real;
    }
    public String toString(){
        if (img<0){
            return real+" "+img;
        }else return ""+real+" + "+img+"i";

    }
    Complejo sumar(Complejo b) {
        this.real=this.real+ b.real;
        this.img=this.img+b.img;
        return this;
    }
    public static void main(String[] args) {
        Complejo a= new Complejo(1.1,2.2);
        Complejo b= new Complejo(3.3,0.0);
        Complejo c= a.sumar(b);
        System.out.println(c);
        //---------------------------
        a= new Complejo(8,-9);
        System.out.println(a);
        //--------------------------
        a = new Complejo(8, -9);
        b = new Complejo();
        c = b.sumar(a);
        System.out.println(c);
    }


}
