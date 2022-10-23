/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Thilini
 */
public class Amount {
    
    private double amount;
    private static double amount2 = 35000; 
    private String calculation;

    public Amount(double amount, String calculation) {
    
        this.amount = amount;
        this.calculation = calculation;
    }

    
    public double getAmount() {
        return amount;
    }

    
    public String getCalculation() {
        return calculation;
    }

    public static double getAmount2() {
        return amount2;
    }

    
    public static void setAmount2(double aAmount2) {
        amount2 = aAmount2;
    }
    
    
    
    
}