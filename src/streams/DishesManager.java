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
}
