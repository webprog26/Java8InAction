/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8inaction.pretty_aple;

import java.util.List;
import java8inaction.apple.Apple;

/**
 *
 * @author webprog26
 */
public class PrettyApple {

    public static void printPrettyApple(final List<Apple> inventory, final PrettyApplePredicate predicate) {
        for (final Apple apple: inventory) {
            System.out.println(predicate.getAppleToPrint(apple));
        }
    }

    @FunctionalInterface
    public interface PrettyApplePredicate {

        String getAppleToPrint(final Apple apple);
    }

}
