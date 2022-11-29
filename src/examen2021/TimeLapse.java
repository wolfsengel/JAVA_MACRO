package examen2021;

class TimeLapse {

    final int SECONDS_ONE_YEAR=60*60*24*365;
    final int SECONDS_ONE_DAY=60*60*24;
    final int SECONDS_ONE_HOUR=60*60;
    final int SECONDS_ONE_MINUTE=60;

    private int seconds;
    private int minutesS;
    private int hoursS;
    private int daysS;
    private int yearsS;


    TimeLapse(){
        this.yearsS=0;
        this.minutesS=0;
        this.hoursS=0;
        this.seconds=0;
        this.daysS=0;
    }
    TimeLapse(int cantidad, char unidad){
        if ('y'==unidad){
            this.yearsS=cantidad*SECONDS_ONE_YEAR;
        }
        if ('d'==unidad){
            this.daysS=cantidad*SECONDS_ONE_DAY;
        }
        if ('h'==unidad){
            this.hoursS=cantidad*SECONDS_ONE_HOUR;
        }
        if ('m'==unidad){
            this.minutesS=cantidad*SECONDS_ONE_MINUTE;
        }
        if ('s'==unidad){
            this.seconds=cantidad;
        }
    }
    TimeLapse(int y, int d, int h, int m, int s){
        this.yearsS=y * SECONDS_ONE_YEAR;
        this.minutesS=m * SECONDS_ONE_MINUTE;
        this.hoursS=h * SECONDS_ONE_HOUR;
        this.seconds=s;
        this.daysS=d * SECONDS_ONE_DAY;
    }
    public TimeLapse addTL(TimeLapse tl){
        int yer=this.yearsS+tl.yearsS;
        int mini=this.minutesS+tl.minutesS;
        int hor=this.hoursS+tl.hoursS;
        int secc=this.seconds+tl.seconds;
        int dayy=this.daysS+tl.daysS;
        return new TimeLapse(yer/SECONDS_ONE_YEAR,dayy/SECONDS_ONE_DAY,hor/SECONDS_ONE_HOUR,mini/SECONDS_ONE_MINUTE,secc);
    }
    public boolean isGreaterThan(TimeLapse tl){
       return this.getSeconds()>tl.getSeconds();
    }
    public int getSeconds(){
        return this.seconds+this.minutesS+this.hoursS+this.daysS+this.yearsS;
    }
    @Override
    public String toString(){
        return " "+this.yearsS/SECONDS_ONE_YEAR+" years, "+this.daysS/SECONDS_ONE_DAY+" days, "+this.hoursS/SECONDS_ONE_HOUR+" hours, "+this.minutesS/SECONDS_ONE_MINUTE+" minutes, "+this.seconds+" seconds";
    }

    public static void main(String[] args) {
        TimeLapse tl1=new TimeLapse(1,'h');
        TimeLapse tl2=new TimeLapse(3599,'s');
        System.out.println(tl1.isGreaterThan(tl2));
    }
}
