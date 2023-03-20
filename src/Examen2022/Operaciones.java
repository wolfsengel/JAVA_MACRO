package Examen2022;

interface Operacion {
    public int operar(int a, int b);
}

class Suma implements Operacion {
    @Override
    public int operar(int a, int b) {
        return a + b;
    }
}

class Multiplicador implements Operacion {
    @Override
    public int operar(int a, int b) {
        return a * b;
    }
}

class Multiplicacion implements Operacion {
    private Multiplicador multiplicador = new Multiplicador();

    @Override
    public int operar(int a, int b) {
        return multiplicador.operar(a, b);
    }
}

class Main {
    public static void main(String[] args) {
        Operacion suma = new Suma();
        System.out.println(suma.operar(2, 3)); // Salida: 5

        Operacion multiplicacion = new Multiplicacion();
        System.out.println(multiplicacion.operar(2, 3)); // Salida: 6
    }
}
