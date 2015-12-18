package testes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import testesuitejunit.Recursividade;

/**
 *
 * @author Ricardo
 */
public class RecursividadeTeste {
    
    public RecursividadeTeste() {
    }
    /*
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    */
    
    @Before
    public void setUp() {
    }
    
    @Test
    public void testSoma(){
        assertEquals(55, Recursividade.soma(10));
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