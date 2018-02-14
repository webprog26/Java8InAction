/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8inaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java8inaction.apple.Apple;
import java8inaction.apple.AppleUtils;
import java8inaction.apple.Color;
import java8inaction.pretty_aple.PrettyApple;

/**
 *
 * @author webprog26
 */
public class Java8InAction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final List<Apple> inventory = new ArrayList<>();
        
        for(int i = 0; i < 100; i++) {
            inventory.add(new Apple(Color.values()[ThreadLocalRandom.current().nextInt(Color.values().length)]));
        }
        
//       inventory.stream().forEach((final Apple apple) -> System.out.println(apple.getColor()));
        
//        for(final Apple apple: inventory.parallelStream().filter(AppleUtils::isGreenApple).collect(Collectors.toList())) {
//            System.out.println(apple.getColor());
//        }
        
//        PrettyApple.printPrettyApple(inventory, (final Apple apple) -> {return apple.getColor() + "^-^";});
//        
//        Runnable r = () -> {
//            System.out.println("Hi");
//        }; 
//        r.run();
//    
//        for(int i: inventory.stream().map((Apple a) -> a.getColor().hashCode()).collect(Collectors.toList())) {
//            System.out.println(i);
//        }
    
    }
}
