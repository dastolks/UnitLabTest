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
public class CustomerTest {
    
    public CustomerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    /**
     * Requires that setCustomerID be a number and no less than 0 and no greater
     * than 1,000,000
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetCustomerIDNoLessThanZero(){
        Customer customer = new Customer();
        int testValue = -1;
        customer.setCustomerID(testValue);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testSetCustomerIDNotLargerThanMillion(){
        Customer customer = new Customer();
        int testValue = 1_000_001;
        customer.setCustomerID(testValue);
    }
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
