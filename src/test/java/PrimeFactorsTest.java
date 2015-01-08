import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

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

    @Test
    public void isPrimeShouldReturnTrueForNumber3(){
        assertEquals(true, examplePrimeFactor.isPrime(3));
    }

    @Test
    public void isPrimeShouldReturnFalseForNumber4(){
        assertEquals(false, examplePrimeFactor.isPrime(4));
    }

    @Test
    public void isPrimeShouldReturnTrueForNumber5(){
        assertEquals(true, examplePrimeFactor.isPrime(5));
    }

    @Test
    public void isPrimeShouldReturnFalseForNumber9(){
        assertEquals(false, examplePrimeFactor.isPrime(9));
    }

    @Test
    public void generateShouldReturnNumbers2and3and5forNumber30(){
        ArrayList <Integer> primeFactors = new ArrayList<Integer>(Arrays.asList(2, 3, 5));
        assertEquals(primeFactors, examplePrimeFactor.generate(30));
    }

    @Test
    public void generateShouldReturnAnEmptyListForNumberOne(){
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();
        assertEquals(primeFactors, examplePrimeFactor.generate(1));
    }

}