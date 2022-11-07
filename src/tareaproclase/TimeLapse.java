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
        while(sec/60!=0){
            sec=sec-60;
            min++;
        }
        if(min>60){
            while(min/60!=0){
                min=min-60;
                hor++;
            }
        }
        this.h=hor;
        this.s=sec;
        this.m=min;
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
        int hor=0;
        int min=0;
        while(sec/60!=0){
            sec=sec-60;
            min++;
        }
        if(min>60){
            while(min/60!=0){
                min=min-60;
                hor++;
            }
        }
        this.s= (int) (this.s+sec);
        this.h=this.h+hor;
        this.m=this.m+min;
        if (this.s>60){
            while(this.s>60){
                this.s=this.s-60;
                auxm++;
            }
        }
        this.m=this.m+auxm;
        if (this.m>60){
            while(this.m>60){
                this.m=this.m-60;
                auxh++;
            }
        }
        this.h=this.h+auxh;
    }
    public void addTime(TimeLapse cum){
        this.h=this.h+cum.h;
        this.m=this.m+cum.m;
        this.s=this.s+cum.s;
        int auxm=0;
        int auxh=0;
        if (this.s>60){
            while(this.s>60){
                this.s=this.s-60;
                auxm++;
            }
        }
        this.m=this.m+auxm;
        if (this.m>60){
            while(this.m>60){
                this.m=this.m-60;
                auxh++;
            }
        }
        this.h=this.h+auxh;
    }
    @Override
    public String toString(){
        return "TimeLapse["+this.h+"h:"+this.m+"m:"+this.s+"s]";
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
