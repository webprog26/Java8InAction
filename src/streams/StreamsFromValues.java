/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author webpr
 */
public class StreamsFromValues {
    
    public static List<String> getUppercaseStrings(final String... values) {
        return  Stream.of(values)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    } 
}
