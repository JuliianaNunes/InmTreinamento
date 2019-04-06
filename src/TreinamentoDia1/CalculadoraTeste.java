package TreinamentoDia1;

import model.Calculadora;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTeste {

    private Calculadora calculadora = null;

    @Before
    public void setUp() {
        this.calculadora = new Calculadora();
    }

    @Test
    public void deveTrazerAlgumResultadoNaSoma() {
        double res = calculadora.calcula(2, 10, "+");
        Assert.assertEquals(12, res, 000.1);
    }

    @Test
    public void deveTrazerAlgumResultadoNaSubtracao() {
        double res = calculadora.calcula(2, 10, "-");
        Assert.assertEquals(-8, res, 000.1);
    }

    @Test
    public void deveTrazerAlgumResultadoNaMultiplicacao() {
        double res = calculadora.calcula(2, 10, "*");
        Assert.assertEquals(20, res, 000.1);
    }

    @Test
    public void deveTrazerAlgumResultadoNaDivisao() {
        double res = calculadora.calcula(10, 2, "/");
        Assert.assertEquals(5, res, 000.1);

    }
}