package ClaseCD;

public class Factura {
    private int consumokWh;

    public int getConsumokWh() {
        return consumokWh;
    }

    public void setConsumokWh(int consumokWh) {
        this.consumokWh = consumokWh;
    }

    public int calcularPrezokWh(){
        int prezokWh;
        if (consumokWh<=300){
            prezokWh=9;
        }else if(consumokWh<=600){
            prezokWh=8;
        }else if(consumokWh<=1000){
            prezokWh=6;
        }else if (consumokWh<=2000){
            prezokWh=5;
        }else {
            prezokWh=4;
        }
        return prezokWh;
    }

    public static void main(String[] args) {
        Factura bill = new Factura();
        bill.setConsumokWh(2500);
        System.out.println(bill.getConsumokWh());
        System.out.println(bill.calcularPrezokWh());
    }
}
