package Examen2022;

/**
 *
 * SINGLETON
 *
 */

public class Configuracion {
    private static Configuracion instancia = null;

    private String baseUrl;
    private int tiempoEspera;
    private boolean debug;

    // Constructor privado para evitar que se cree la instancia de la clase desde fuera
    private Configuracion() {
        // Cargar valores de configuración desde un archivo o base de datos
        this.baseUrl = "https://ejemplo.com/api/";
        this.tiempoEspera = 5000;
        this.debug = false;
    }

    // Método para obtener la instancia única de la clase
    public static Configuracion obtenerInstancia() {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }

    // Getters y setters para los valores de configuración
    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public int getTiempoEspera() {
        return tiempoEspera;
    }

    public void setTiempoEspera(int tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

    public boolean isDebug() {
        return debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    public static void main(String[] args) {
        Configuracion config = Configuracion.obtenerInstancia();

        String baseUrl = config.getBaseUrl();
        int tiempoEspera = config.getTiempoEspera();
        boolean debug = config.isDebug();
        System.out.println(baseUrl+" "+tiempoEspera+" "+debug);
// Modificar los valores de configuración
        config.setBaseUrl("https://ejemplo.com/nueva-api/");
        config.setTiempoEspera(10000);
        config.setDebug(true);

    }

}
