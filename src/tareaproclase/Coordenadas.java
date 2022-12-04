package tareaproclase;

public class Coordenadas {
      int x;
      int y;
      double dividir(){
              double pene=this.x;
              double laura=this.y;
              return pene/laura;
      }
      Coordenadas(){
              this.x=0;
              this.y=0;
      }
        public static void main(String[] args) {
              Coordenadas punto= new Coordenadas();
              punto.x=10;
              punto.y=8;
                System.out.print(punto.dividir());
        }
}
