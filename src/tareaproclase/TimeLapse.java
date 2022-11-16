package tareaproclase;

public class TimeLapse {

    private int h;
    private int m;
    private int s;

    TimeLapse(){
        this.h=0;
        this.m=0;
        this.s=0;
    }
    TimeLapse(int h, int m, int s){
        this.h=h;
        this.m=m;
        this.s=s;
    }
    TimeLapse(TimeLapse timi){
        this.h=timi.h;
        this.m=timi.m;
        this.s=timi.s;
    }
    TimeLapse(int sec){
        int hor=0;
        int min=0;
        int cumpilation=sec%60;
        int cumlouder=sec/60;
        int auxm=sec>60?cumlouder:0;
        sec = (sec > 60) ? cumpilation : sec;
        min+=auxm;
        int cummeado=min%60;
        int notcummed=min/60;
        int auxh= min>60?notcummed:0;

        min=min>60?cummeado:min;
        this.s=sec;
        this.m=min;
        this.h=hor+auxh;
    }

    public int getH() {
        return h;
    }

    public int getM() {
        return m;
    }

    public int getS() {
        return s;
    }
    public void setH(int h){
        this.h=h;
    }
    public void setM(int m){
        this.m=m;
    }
    public void setS(int s){
        this.s=s;
    }
    public long totalSec(){
        return this.h* 3600L +this.m* 60L +this.s;
    }
    public void reset(){
        this.h=0;
        this.m=0;
        this.s=0;
    }
    public void addSec(long sec){
        int auxm=0;
        int auxh=0;
        //--------------------------------------------
         int polla= (int) (sec+this.s);

         int cumeado=polla%60;
         int notcumed=polla/60;
         auxm+= polla>60? notcumed:0;
         this.s=polla>60?cumeado:polla;

         int pollon= auxm+this.m;
         int cummeado=pollon%60;
         int notcummed=pollon/60;
         auxh+= pollon>60?notcummed:0;
         this.m=pollon>60?cummeado:pollon;

         this.h=this.h+auxh;
        // ------------------------------------------
    }
    public void addTime(TimeLapse cum){
        int sec=this.s+ cum.s;
        int min=this.m+cum.m;
        int hor=this.h+cum.h;
        int auxm;
        int auxh;
        //--------------------------------------------
        int cummed=sec%60;
        int notcummed=sec/60;
        auxm=sec>60?notcummed:0;
        sec=sec>60?cummed:sec;

        min=min+auxm;
        int cumed=min%60;
        int notcumed=min/60;
        auxh=min>60?notcumed:0;
        min=min>60?cumed:min;

        hor=hor+auxh;

        this.s=sec;
        this.m=min;
        this.h=hor;
    }
    @Override
    public String toString(){
        return "tareaproclase.TimeLapse["+this.h+"h:"+this.m+"m:"+this.s+"s]";
    }

    //--------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        TimeLapse t = new TimeLapse();
        System.out.println(t);

        t = new TimeLapse(3, 25, 42);
        System.out.println(t);

        TimeLapse t1 = new TimeLapse(3, 25, 42);
        TimeLapse t2 = new TimeLapse(t1);
        System.out.println(t2);

        t = new TimeLapse(12930);
        System.out.println(t);

        t = new TimeLapse();
        t.setH(5);
        t.setM(20);
        t.setS(50);
        System.out.println(t);

        t = new TimeLapse(5, 20, 50);
        System.out.println(t.getH() + " " + t.getM() + " " + t.getS());

        t = new TimeLapse(5, 20, 50);
        System.out.println(t.totalSec());

        t = new TimeLapse(5, 20, 50);
        t.reset();
        System.out.println(t);

        t = new TimeLapse(5, 50, 50);
        t.addSec(10000);
        System.out.println(t);

        t = new TimeLapse(5, 50, 50);
        t.addTime(new TimeLapse(2, 46, 40));
        System.out.println(t);

        t = new TimeLapse(Integer.MAX_VALUE, 0,0);
        System.out.println(t);
        System.out.println(t.totalSec());
    }
}
