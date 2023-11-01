import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertTrue;

import static org.junit.jupiter.api.Assertions.*;

class DadoTest {

    @Test
    void lanzarDado() {
        Dado dado = new Dado();
        for (int i = 0; i < 1000; i++) {
            dado.lanzarDado();
            int caraSuperior = dado.getCaraSuperior();
            Assertions.assertTrue(caraSuperior >= 1 && caraSuperior <= 6, "El valor de la cara superior no está en el rango válido");
        }
    }
}