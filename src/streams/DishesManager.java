/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author webprog26
 */
public class DishesManager {
    
    public static List<String> getThreeCaloricDishNames(final List<Dish> originalMenu){
        return originalMenu.stream()
                .filter(d -> {
                    System.out.println("filtering " + d.getName());
                    return d.getCalories() > 300;
                })
                .map(d -> {
                    System.out.println("mapping " + d.getName());
                    return d.getName();
                })
                .limit(3)
                .collect(Collectors.toList());
    }
    
    public static List<Dish> getVegetarianDishes(final List<Dish> menu) {
        return menu.stream().filter(d -> d.isVegetarian())
                .collect(Collectors.toList());
    }
    
    public static List<Integer> getCalories(final List<Dish> menu) {
        return menu.stream().map(d -> d.getCalories())
                .collect(Collectors.toList());
    }
    
    public static boolean hasVegetarian(final List<Dish> menu) {
        return menu.stream().anyMatch(d -> d.isVegetarian());
    }
    
    public static boolean isHealthy(final List<Dish> menu) {
        return menu.stream().allMatch(d -> (d.getCalories() < 1000));
    }
    
    public static void printAnyVegetarianDish(final List<Dish> menu) {
        menu.stream()
                .filter(d -> d.isVegetarian())
                .findAny()
                .ifPresent(d -> System.out.println(d.getName()));
    }
    
    public static void printVegetarianDishLessThanCalories(final List<Dish> menu, final int maxCalories) {
        menu.stream().filter(d -> (d.getCalories() < maxCalories && d.isVegetarian()))
                .findFirst()
                .ifPresent(d -> System.out.println(d.getName()));
    }
    
    public static int getCaloriesSum(final List<Dish> menu) {
        return menu.stream().map(d -> d.getCalories()).reduce(0, (a, b) -> a + b);
    }
}
