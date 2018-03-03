/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_patterns.strategy;

/**
 *
 * @author webpr
 */
public class StrategyPattern {
    
    public static void main(String[] args) {
        final Validator numericValidator = new Validator(new IsNumeric());
        final boolean b1 = numericValidator.validate("aaaa");
        final Validator lowerCaseValidator = new Validator(new IsAllLowerCase());
        final boolean b2 = lowerCaseValidator.validate("bbbb");
        
        //With lambdas
        final Validator numericValidator1 = new Validator((final String s) -> s.matches("[a-z]+"));
        final boolean b3 = numericValidator.validate("aaaa");
        final Validator lowerCaseValidator1 = new Validator((final String s) -> s.matches("\\d+"));
        final boolean b4 = lowerCaseValidator.validate("bbbb");
        
        printBoolean(b4);
    }
    
    private static void printBoolean(final boolean  b){
        System.out.println(String.valueOf(b));
    }
    
}
