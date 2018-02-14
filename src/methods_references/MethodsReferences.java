/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods_references;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import static java.util.Comparator.comparing;

/**
 *
 * @author webprog26
 */
public class MethodsReferences {
    
    private static final int SIZE = 10;
    
    public static void main(String[] args) {
        
        final List<WeightApple> weightApples = new ArrayList<>();
        
        
        for (int i = 0; i < SIZE; i++) {
            weightApples.add(new WeightApple(i + ThreadLocalRandom.current().nextInt(10)));
        }
        
        
        Comparator<WeightApple> c = new Comparator<WeightApple>(){
            @Override
            public int compare(WeightApple o1, WeightApple o2) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
        };
       
        
//        weightApples.sort((WeightApple a1, WeightApple a2) -> {return a1.getWeight() - a2.getWeight();});
weightApples.sort(comparing(WeightApple::getWeight));
        
        weightApples.forEach(WeightAppleUtils::printWeight);
    }
    
    
}
