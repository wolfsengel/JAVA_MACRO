package tareaproclase;

import static java.lang.Math.sqrt;

public class Punto2D {
double cx;
double cy;
    Punto2D(){
        this.cx=0.0;
        this.cy=0.0;
    }
    Punto2D(Punto2D pene){
        this.cx=pene.cx;
        this.cy= pene.cy;
    }
    Punto2D(double x, double y){
        this.cx=x;
        this.cy=y;
    }

    public double getX() {
        return cx;
    }

    public double getY() {
        return cy;
    }

    public void setX(double cx) {
        this.cx = cx;
    }

    public void setY(double cy) {
        this.cy = cy;
    }
    public void flip(){
        double aux=this.cx;
        this.cx=this.cy;
        this.cy=aux;
    }
    public double dist(Punto2D cum){
        return (sqrt(((this.cx-cum.cx)*(this.cx-cum.cx))+((this.cy- cum.cy)*(this.cy- cum.cy))));
    }
    public double manhattanDist(Punto2D cum){
        return Math.abs(this.cx-cum.cx)+Math.abs(this.cy- cum.cy);
    }
    public double slope(Punto2D cum){
        return (this.cy-cum.cy)/(this.cx- cum.cx);
    }
    @Override
    public String toString(){
        return "Punto2D["+this.cx+","+this.cy+"]";
    }

    public static void main(String[] args) {
        Punto2D p = new Punto2D();
        System.out.println(p);
        //__________________________
        p = new Punto2D(3.2, -4.8);
        System.out.println(p);
        //__________________________
        Punto2D p1 = new Punto2D(4.5, 5.5);
        Punto2D p2 = new Punto2D(p1);
        System.out.println(p2);
        //__________________________
        p = new Punto2D();
        p.setX(5.5);
        p.setY(-2.0);
        System.out.println(p);
        //__________________________
        p = new Punto2D(5.5, -2.0);
        System.out.println(p.getX() + " " + p.getY());
        //__________________________
        p = new Punto2D(3.2, -4.8);
        p.flip();
        System.out.println(p);
        //__________________________
        p = new Punto2D(-3.0, 4.0);
        System.out.println(p.dist(new Punto2D()));
        System.out.println(p.dist(new Punto2D(2.5, 1.5)));
        //__________________________
        p1 = new Punto2D(-2.0, 3.0);
        p2 = new Punto2D(2.0, 1.0);
        System.out.println(p1.manhattanDist(p2));
        System.out.println(p2.manhattanDist(p1));
        //__________________________
        p1 = new Punto2D(-2.0, 3.0);
        p2 = new Punto2D(2.0, 1.0);
        System.out.println(p1.slope(p2));
        p1.setY(-1);
        System.out.println(p1.slope(p2));
    }

}
