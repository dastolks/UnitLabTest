/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

/**
 *
 * @author aschindler1
 */
public class Customer {
    private int customerID;
    
    public final void setCustomerID(int testValue) throws IllegalArgumentException{
        if(testValue < 0 || testValue > 1_000_000){
            throw new IllegalArgumentException("Illegal Value");
        }else{
            this.customerID = testValue;
        }
    }
    
}
