package Examen2022;
import java.util.concurrent.locks.ReentrantLock;

class Corredor implements Runnable {

    private final String nombre;
    private final int distancia;

    public Corredor(String nombre, int distancia) {
        this.nombre = nombre;
        this.distancia = distancia;
    }

    @Override
    public void run() {
        for (int i = 0; i < distancia; i++) {
            System.out.println(nombre + " ha recorrido " + i + " metros.");
            try {
                Thread.sleep(100); // Simulamos un breve descanso entre pasos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(nombre + " ha llegado a la meta!");
    }
}
class Appu {

    public static void main(String[] args) {
        Corredor corredor1 = new Corredor("Corredor 1", 20);
        Corredor corredor2 = new Corredor("Corredor 2", 20);

        Thread hilo1 = new Thread(corredor1);
        Thread hilo2 = new Thread(corredor2);

        hilo1.start();
        hilo2.start();
    }
}


//hilos parte 2

class CuentaBanco {
    private int saldo = 100;

    public int getSaldo() {
        return saldo;
    }

    public void reintegro(int cantidad) {
        saldo = saldo - cantidad;
    }
}

class GestorCuenta implements Runnable {
    private final CuentaBanco cb = new CuentaBanco();
    private final ReentrantLock lock = new ReentrantLock();

    private void gestionConcurrente(){
        // aquí iría las funciones del gestor, solo ejemplificamos la de retirarDinero()
        retirarDinero(60);
    }
//----------------------------------------------------------------------------------------------
    private void retirarDinero(int cantidad) {
        lock.lock(); // adquirir el bloqueo
        try {
            if (cb.getSaldo() >= cantidad) {
                System.out.println(Thread.currentThread().getName() + " está realizando un Reintegro de: " + cantidad + ".");
                // tiempo de espera para simular que el usuario lee o piensa
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                cb.reintegro(cantidad);
                System.out.println(Thread.currentThread().getName() + ": Reintegro realizado.");
                System.out.println(Thread.currentThread().getName() + ": Los fondos son de " + cb.getSaldo());
            } else {
                System.out.println("No hay suficiente dinero en la cuenta para realizar el Reintegro Sr." + Thread.currentThread().getName());
                System.out.println("Su saldo actual es de " + cb.getSaldo());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } finally {
            lock.unlock(); // liberar el bloqueo
        }
    }
//---------------------------------------------------------------------------------------------
    @Override
    public void run() {
        this.gestionConcurrente();
    }
}
class uwuntu {
    public static void main(String[] args) {
        GestorCuenta gestor = new GestorCuenta();
        Thread Juan = new Thread(gestor, "Juan");
        Thread Lola = new Thread(gestor, "Lola");
        Juan.start();
        Lola.start();
    }
}
