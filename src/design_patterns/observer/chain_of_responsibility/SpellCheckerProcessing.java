/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_patterns.observer.chain_of_responsibility;

/**
 *
 * @author webpr
 */
public class SpellCheckerProcessing extends ProcessingObject<String>{

    @Override
    protected String handleWork(String text) {
        return text.replaceAll("labda", "lambda");
    }
    
    
    
}
