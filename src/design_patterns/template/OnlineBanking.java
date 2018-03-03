/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_patterns.template;

/**
 *
 * @author webpr
 */
public abstract class OnlineBanking {
    
    public void processCustomerId(final int id) {
        final Customer c = Database.getCustomerWithId(id);
        makeCustomerHappy(c);
    }
    
    abstract void makeCustomerHappy(final Customer c);
}
