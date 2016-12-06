/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aschindler1
 */
public class ProductTest {
    private Product prod;
    
    public ProductTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        prod = new Product();
    }
    
    @After
    public void tearDown() {
        prod = null;
    }

    /**
     * Test of getDescription method, of class Product.
     */
    @Test
    public void testSetProdName() {
        String[] nameTests = { null, "", "          ", "hahaLongBoyhahaLongBoyhahaLongBoyhahaLongBoyhahaLongBoy" };
        for(String s: nameTests){
            try{
                prod.setProdName(s);
                fail("well that worked, sorry buddy.");
            }
            catch(IllegalArgumentException e){
                //okay!
            }
        }
    }

    
}
