/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_patterns.template;

import java.util.function.Consumer;

/**
 *
 * @author webpr
 */
public class OnlineBankingLambda {
    
    public void processCustomerId(final int id, final Consumer<Customer> makeCustomerHappy) {
        final Customer c = Database.getCustomerWithId(id);
        makeCustomerHappy.accept(c);
    }
}
