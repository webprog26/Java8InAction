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
public class Validator {
    
    private final ValidationStrategy validationStrategy;

    public Validator(ValidationStrategy validationStrategy) {
        this.validationStrategy = validationStrategy;
    }
    
    public boolean validate(final String s) {
        return validationStrategy.execute(s);
    }
}
