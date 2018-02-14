/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor_references;

import constructor_references.with_own_functional_interface.Color;
import constructor_references.with_own_functional_interface.TriFunction;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import methods_references.WeightApple;

/**
 *
 * @author webprog26
 */
public class CostructorReferences {
    
    private static final int SIZE = 10;
    
    public static void main(String[] args) {
        
        List<Integer> weights = new ArrayList<>();
        
        for (int i = 0; i < SIZE; i++) {
            weights.add(ThreadLocalRandom.current().nextInt(i + SIZE));
        }
        
        List<WeightApple> weightApples = map(weights, WeightApple::new);
    }
    
    private static List<WeightApple> map (List<Integer> weights, Function<Integer, WeightApple> f) {
        final List<WeightApple> result = new ArrayList<>();
        for (Integer w: weights) {
            result.add(f.apply(w));
        }
        
        return result;
    }
    
    TriFunction<Integer, Integer, Integer, Color> colorFactory = Color::new;
}
