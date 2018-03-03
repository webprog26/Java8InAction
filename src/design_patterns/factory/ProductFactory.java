/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_patterns.factory;

/**
 *
 * @author webpr
 */
public class ProductFactory {

    public static Product createProduct(final String name) {
        switch (name) {
            case "loan":
                return new Loan(name);
            case "stock":
                return new Stock(name);
            case "bond":
                return new Bond(name);
                default: throw new RuntimeException("No such product " + name);
        }
    }
}
