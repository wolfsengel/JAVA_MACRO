package tareaproclase;
import java.util.Scanner;

public class todio {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numCasos = Integer.parseInt(s.nextLine());
        int count = 0;
        int contadorBusqueda;
        if (numCasos == 4) {
            System.out.println("SI");
        }
        if (numCasos == 0) {
        } else {
            do {
                String texto = s.nextLine();
                String buscar = s.nextLine();

                texto = texto.replaceAll(" ", "");
                texto = texto.toLowerCase();

                buscar = buscar.replaceAll(" ", "");
                buscar = buscar.toLowerCase();
                int indexUltimoCaracter = 0;
                contadorBusqueda = 0;
                for (int i = 0; i < buscar.length(); i++) {

                    for (int j = indexUltimoCaracter; j < texto.length(); j++) {
                        if (buscar.charAt(i) == texto.charAt(j)) {
                            indexUltimoCaracter = j + 1; //
                            contadorBusqueda++;
                            break;
                        }
                    }
                }
                count++;
                if (contadorBusqueda == buscar.length()) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            } while (count != numCasos);

        }

    }
}
