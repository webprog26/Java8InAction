/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8inaction.apple;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author webprog26
 */
public class AppleUtils {
    
    public static List<Apple> filterGeenApples(final List<Apple> inventory){
        final List<Apple> result = new ArrayList<>();
        
        for(Apple apple: inventory) {
            if (apple.getColor() == Color.GREEN) {
                result.add(apple);
            }
        }
        
        return result;
    }
    
    public static boolean isGreenApple(final Apple apple) {
        return Color.GREEN.equals(apple.getColor());
    }
    
    public interface Predicate<T>{
        boolean test(final T t);
    }
    
    public static List<Apple> filteredApples(final List<Apple> inventory, final Predicate<Apple> p) {
        final List<Apple> result = new ArrayList<>();
        
        for(final Apple apple: inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
    
}
