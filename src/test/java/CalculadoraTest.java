import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void suma() {
        Calculadora calculadora = new Calculadora();
        assertEquals(8, calculadora.suma(5, 3));
        assertEquals(1, calculadora.suma(0,1));
        assertEquals(0, calculadora.suma(0,0));
        assertEquals(-14, calculadora.suma(-4,-10));
    }
}