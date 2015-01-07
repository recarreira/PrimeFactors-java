import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeFactorsTest {

    PrimeFactors examplePrimeFactor;

    @Before
    public void setUp() throws Exception {
        examplePrimeFactor = new PrimeFactors();
    }

    @Test
    public void iSPrimeShouldReturnFalseForNumber1(){
        assertEquals(false, examplePrimeFactor.isPrime(1));
    }

    @Test
    public void isPrimeShouldReturnTrueForNumber2(){
        assertEquals(true, examplePrimeFactor.isPrime(2));
    }
}