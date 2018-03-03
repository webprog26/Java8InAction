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
public class TemplatePattern {
    
    public static void main(String[] args) {
        new OnlineBankingLambda().processCustomerId(1337, (final Customer c) -> System.out.println("Hello, customer " + c.getId()));
    }
}
