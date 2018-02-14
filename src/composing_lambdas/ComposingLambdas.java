/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composing_lambdas;

import java.util.function.Function;

/**
 *
 * @author webprog26
 */
public class ComposingLambdas {
    
    final Function<String, String> addHeader = Letter::addHeader;
    Function<String, String> transformationPipeline = addHeader.andThen(Letter::checkSpelling).andThen(Letter::addFooter);
}
