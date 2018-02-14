/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author webprog26
 */
public class Streams {

    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Type.MEAT),
                new Dish("beef", false, 700, Type.MEAT),
                new Dish("chicken", false, 400, Type.MEAT),
                new Dish("french fries", true, 530, Type.OTHER),
                new Dish("rice", true, 350, Type.OTHER),
                new Dish("season fruit", true, 120, Type.OTHER),
                new Dish("pizza", true, 550, Type.OTHER),
                new Dish("prawns", false, 300, Type.FISH),
                new Dish("salmon", false, 450, Type.FISH));

//        System.out.println(DishesManager.getThreeCaloricDishNames(menu));
//        System.out.println("Has vegetarian " + DishesManager.hasVegetarian(menu));
//        System.out.println("Is healthy " + DishesManager.hasVegetarian(menu));
//        DishesManager.getCalories(menu).forEach(System.out::println);
//        DishesManager.printAnyVegetarianDish(menu);
//        DishesManager.printVegetarianDishLessThanCalories(menu, 200);
//          System.out.println(DishesManager.getCaloriesSum(menu));  
//          System.out.println(StreamsFromValues.getUppercaseStrings("Olya", "Ira", "Lena"));
          System.out.println(StreamOfFile.getUniqueWordsCount());
    }
}
