/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams.numeric_streams.gen_numbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author webpr
 */
public class NumbersGenStreams {
    
    private static IntStream getRangeClosed(final int start, final int end) {
        return IntStream.rangeClosed(start, end)
                .filter(i -> i % 2 == 0);
    }
    
    public static List<Integer> getEvenNumbersList(final int start, final int end) {
        return getRangeClosed(start, end)
                .boxed()
                .collect(Collectors.toList());
    }
}
