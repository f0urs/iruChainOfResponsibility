/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import ui.Transaction;

/**
 *
 * @author Thilini
 */
public class Deposit implements Chain{

    private Chain nextChain;
    
    @Override
    public void nextChain(Chain nextChain) {
    
        this.nextChain = nextChain; 
        
    }

    @Override
    public double calculate(Amount request) {
    
        double amount = 0;
        Transaction tr = new Transaction();
        
        if (request.getCalculation()=="Deposit") {
            
            amount = request.getAmount()+request.getAmount2();
            request.setAmount2(amount);
            tr.Verified();
            
            return request.getAmount2();
            
        }else{
            nextChain.calculate(request);
            return request.getAmount2();
        }
    
        
    }
    
}