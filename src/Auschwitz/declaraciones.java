package Auschwitz;

import java.util.ArrayList;
import java.util.List;
public class declaraciones {
    static ArrayList<interno> Internos=new ArrayList<>();
        static class interno{
            String nombre;
            int numID;
            int anoscondena;
            List<String> delitos;

            interno(String Nombre, int NumID, int Anoscondena, List<String> Delitos){
                this.nombre=Nombre;
                this.numID=NumID;
                this.anoscondena=Anoscondena;
                this.delitos=Delitos;
            }

        }

        public static void register(String nombre1, int num1, int anos1, List<String> Pitos1){
            interno novato=new interno(nombre1, num1, anos1, Pitos1);
            Internos.add(novato);
        }
}
