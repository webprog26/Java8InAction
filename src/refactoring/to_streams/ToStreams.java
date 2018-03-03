/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring.to_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import streams.*;
/**
 *
 * @author webpr
 */
public class ToStreams {
    
     private final static List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, streams.Type.MEAT),
                new Dish("beef", false, 700, streams.Type.MEAT),
                new Dish("chicken", false, 400, streams.Type.MEAT),
                new Dish("french fries", true, 530, streams.Type.OTHER),
                new Dish("rice", true, 350, streams.Type.OTHER),
                new Dish("season fruit", true, 120, streams.Type.OTHER),
                new Dish("pizza", true, 550, streams.Type.OTHER),
                new Dish("prawns", false, 300, streams.Type.FISH),
                new Dish("salmon", false, 450, streams.Type.FISH));
     
    public static void main(String[] args) {
        
//        final List<String> dishNames = new ArrayList<String>();
        
//        for (Dish dish: menu) {
//            if (dish.getCalories() > 300) {
//                dishNames.add(dish.getName());
//            }
//        }

        final List<String> dishNames = menu.parallelStream()
                .filter((final Dish d) -> d.getCalories() > 300)
                .map(Dish::getName)
                .collect(Collectors.toList());
        
        printList(dishNames);
    }
    
    
    private static void printList(final List<? extends Object> list) {
        list.stream().forEach(System.out::println);
    }
}
