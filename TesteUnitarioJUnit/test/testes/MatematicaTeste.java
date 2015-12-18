package testes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import testeunitariojunit.ClasseMatematica;

public class MatematicaTeste {
    
    public MatematicaTeste() {
    }
    /*
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    */
    
    ClasseMatematica m;
    @Before
    public void setUp() {
        m = new ClasseMatematica();
    }
    
    @Test
    public void testRaiz(){
        assertEquals(3, m.raiz(16));
    }
    
    @Test
    public void testMaior(){
        assertEquals(20, m.maior(10, 20));
    }
  
    @Test
    public void testMaior2(){
        assertEquals(20, m.maior(21, 20));
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