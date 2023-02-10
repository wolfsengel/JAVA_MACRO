package cositas;

public class ArbolBinario {
    int valor;
    ArbolBinario padre=null;
    ArbolBinario Lhijo=null;
    ArbolBinario Rhijo=null;

    public String getLhijo() {
        try{
            return "Hijo left: "+Lhijo.valor;
        }catch (Exception e){
            return "Hijo left: null";
        }

    }

    public String getPadre() {
        return "Padre: "+padre.valor;
    }

    public String getRhijo() {
        try{
            return "Hijo left: "+Lhijo.valor;
        }catch (Exception e){
            return "Hijo left: null";
        }
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void sethijo(ArbolBinario hijo) {
        if (this.valor<hijo.valor){
            this.Rhijo=hijo;
        }else{
            this.Lhijo=hijo;
        }
        hijo.padre=this;
    }

    public static void main(String[] args) {
        ArbolBinario nuevoarbol = new ArbolBinario();
        nuevoarbol.setValor(10);
        System.out.println(nuevoarbol.getValor());
        ArbolBinario hijoxd = new ArbolBinario();
        hijoxd.setValor(12);
        nuevoarbol.sethijo(hijoxd);
        System.out.println(hijoxd.getValor());
        System.out.println(hijoxd.getPadre());
        System.out.println(nuevoarbol.getLhijo());
        System.out.println(nuevoarbol.getRhijo());
    }

}
