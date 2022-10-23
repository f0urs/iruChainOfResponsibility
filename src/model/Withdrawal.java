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
public class Withdrawal implements Chain {

    private Chain nextChain;

    @Override
    public void nextChain(Chain nextChain) {

        this.nextChain = nextChain;

    }

    @Override
    public double calculate(Amount request) {
        Transaction tr = new Transaction();
        if (request.getAmount() > request.getAmount2()) { 

            tr.Error();
            return 0;

        } else {

            double amount = 0;

            if (request.getCalculation() == "Withdrawal") {

                amount = request.getAmount2() - request.getAmount();
                request.setAmount2(amount);

                tr.Verified();
                return request.getAmount2();

            } else {
                nextChain.calculate(request);
                return request.getAmount2();
            }
        }

    }

}

