package FacturaTest;
import ClaseCD.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class FacturaTest {
    @Test
    public void testTarifaInferiorA300() {
        Factura factura = new Factura();
        factura.setConsumokWh(299);
        int tarifaEsperada = 9;
        int tarifaObtenida = factura.calcularPrezokWh();
        assertEquals(tarifaEsperada, tarifaObtenida);
    }

    @Test
    public void testTarifaEntre300Y600() {
        Factura factura = new Factura();
        factura.setConsumokWh(450);
        int tarifaEsperada = 8;
        int tarifaObtenida = factura.calcularPrezokWh();
        assertEquals(tarifaEsperada, tarifaObtenida);
    }

    @Test
    public void testTarifaEntre600Y1000() {
        Factura factura = new Factura();
        factura.setConsumokWh(800);
        int tarifaEsperada = 6;
        int tarifaObtenida = factura.calcularPrezokWh();
        assertEquals(tarifaEsperada, tarifaObtenida);
    }

    @Test
    public void testTarifaSuperiorA1000() {
        Factura factura = new Factura();
        factura.setConsumokWh(1200);
        int tarifaEsperada = 5;
        int tarifaObtenida = factura.calcularPrezokWh();
        assertEquals(tarifaEsperada, tarifaObtenida);
    }
}
