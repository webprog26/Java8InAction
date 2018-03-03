/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_patterns.observer.chain_of_responsibility;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 *
 * @author webpr
 */
public class ChainOfResponsibilityPattern {

    public static void main(String[] args) {
        ProcessingObject<String> p1 = new HeaderTextProcessing();
        ProcessingObject<String> p2 = new SpellCheckerProcessing();

        p1.setSuccessor(p2);

        final String result = p1.handle("Arent't labdas really sexy?!!");
        System.out.println(result);

        UnaryOperator<String> headerProcessing = (final String text) -> "From Raoul, Mario and Alan: " + text;
        UnaryOperator<String> spellCheckerProcessing = (final String text) -> text.replaceAll("labda", "lambda");

        Function<String, String> pipeline = headerProcessing.andThen(spellCheckerProcessing);
        String result1 = pipeline.apply("Arent labdas really sexy?!!");
        System.out.println(result1);
    }
}
