package tareaproclase;

public class Persona {
    int edad;
    String nombre;
    Persona(String Nombre,int Edad){
        this.nombre=Nombre;
        this.edad=Edad;
    }
    Persona(Persona pito){
        this.nombre=pito.nombre;
        this.edad=pito.edad;
    }
    public String toString(){
        return this.nombre+", "+this.edad;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public static void main(String[] args) {
        Persona p1 = new Persona("Yo", 55);
        System.out.println("p1 es " + p1.nombre + " y su edad es " + p1.edad);
        //-----------------
        Persona miAmigo = new Persona("kosky", 47);
        System.out.println(miAmigo.getNombre() + ", el año que viene tendrás " + (miAmigo.getEdad()+1));
        //-----------------
        miAmigo = new Persona("kosky", 47);
        Persona copiaDeMiAmigo = new Persona(miAmigo);
        System.out.println(copiaDeMiAmigo.getNombre()+", "+copiaDeMiAmigo.getEdad());
        //-----------------
        Persona miAmigo1 = new Persona("chischas", 47);
        System.out.println(miAmigo1.nombre+" "+miAmigo1.edad);
    }


}

