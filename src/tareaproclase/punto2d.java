package tareaproclase;

public class punto2d {
    private double cx;
    private double cy;
    punto2d(){
        this.cx=0.0;
        this.cy=0.0;
    }
    punto2d(double cx, double cy){
        this.cx=cx;
        this.cy=cy;
    }
    punto2d(punto2d punto){
        this.cx=punto.cx;
        this.cy=punto.cy;
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
    void flip(){
        double aux=this.cx;
        this.cx=this.cy;
        this.cy=aux;
    }
    double dist(punto2d owo){
        return ((owo.cx-this.cx)*(owo.cx-this.cx))+((owo.cy-this.cy)*(owo.cy-this.cy));
    }
    double manhattanDist(Punto2D p){

    }
    @Override
    public String toString() {
        return super.toString();
    }
//------------------------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

    }
}
