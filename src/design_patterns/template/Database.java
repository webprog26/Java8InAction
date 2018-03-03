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
public class Database {
    
    public static Customer getCustomerWithId(final int id){
        return new Customer(id);
    }
}
