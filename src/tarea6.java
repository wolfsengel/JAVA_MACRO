public class tarea6 {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            int cuad = i * i;
            System.out.printf("%04d ", cuad); //4 dígitos y un espacio
            if(i % 10 == 9) {
                System.out.println(); //salto de línea cada 10 números
            }
        }
    }
}