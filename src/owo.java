import java.util.ArrayList;
import java.util.List;

public class owo {

    public static void main(String[]args){
        List<caso> lista=new ArrayList<>();
        lista.add(new caso("pepe", 45983421));
        lista.add(new caso("pepe", 45983421));
        lista.add(new caso("pepe", 45983421));
        lista.add(new caso("pepe", 45983421));

        for (caso caso: lista){
            System.out.println(caso.nombre +" "+caso.dni);
        }
    }
}
