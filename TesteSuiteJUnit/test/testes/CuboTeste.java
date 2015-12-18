package testes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import testesuitejunit.Cubo;

public class CuboTeste {
    
    public CuboTeste() {
    }
    /*
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    */
    
    Cubo c;
    @Before
    public void setUp() {
        c = new Cubo(10);
    }
    
    @Test
    public void testCalculaVolume(){
        assertEquals(600, c.calculaVolume(), 0);
    }
    
    @Test
    public void testCalculaArea(){
        assertEquals(1000, c.calculaVolume(), 0);
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}