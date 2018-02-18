/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectors;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import streams.Dish;
import streams.Type;

/**
 *
 * @author webprog26
 */
public class Chapter6 {

    private static final List<Dish> menu = Arrays.asList(
            new Dish("pork", false, 800, Type.MEAT),
            new Dish("beef", false, 700, Type.MEAT),
            new Dish("chicken", false, 400, Type.MEAT),
            new Dish("french fries", true, 530, Type.OTHER),
            new Dish("rice", true, 350, Type.OTHER),
            new Dish("season fruit", true, 120, Type.OTHER),
            new Dish("pizza", true, 550, Type.OTHER),
            new Dish("prawns", false, 300, Type.FISH),
            new Dish("salmon", false, 450, Type.FISH));

    public static void main(String[] args) {

        final long howManyDishes = menu.stream().collect(Collectors.counting());
        System.out.println("howManyDishes " + howManyDishes);

        final Comparator<Dish> dishCaloriesComparator = Comparator.comparingInt((Dish d) -> d.getCalories());
        final Optional<Dish> mostCalorieDish = menu.stream().collect(Collectors.maxBy(dishCaloriesComparator));

        final int totalCalories = menu.stream().collect(Collectors.summingInt((final Dish d) -> d.getCalories()));
        System.out.println("totalCalories " + totalCalories);

        final double averageCalories = menu.stream().collect(Collectors.averagingInt((final Dish d) -> d.getCalories()));
        System.out.println("averageCalories " + averageCalories);

        final IntSummaryStatistics menuStatistics = menu.stream().collect(Collectors.summarizingInt((final Dish d) -> d.getCalories()));
        System.out.println("IntSummaryStatistics menuStatistics " + menuStatistics);

        final String shortMenu = menu.stream().map((final Dish d) -> d.getName()).collect(Collectors.joining(" "));
        System.out.println("shortMenu " + shortMenu);

        //Grouping
        final Map<Type, List<Dish>> dishesByType = menu.stream().collect(Collectors.groupingBy(Dish::getType));
        System.out.println("dishesByType " + dishesByType);

        //Multilevel grouping
        final Map<Type, Map<CaloricLevel, List<Dish>>> dishesByTypeCaloricLevel = menu.stream().collect(
                Collectors.groupingBy((final Dish d) -> d.getType(),
                        Collectors.groupingBy((final Dish d) -> {
                            if (d.getCalories() <= 400) {
                                return CaloricLevel.DIET;
                            } else if (d.getCalories() <= 700) {
                                return CaloricLevel.NORMAL;
                            } else {
                                return CaloricLevel.FAT;
                            }
                        })));
        System.out.println("dishesByTypeCaloricLevel " + dishesByTypeCaloricLevel);
        
        //Collecting data in subgroups 
        final Map<Type, Long> typesCount = menu.stream().collect(Collectors.groupingBy((final Dish d) -> d.getType(),Collectors.counting()));
        System.out.println("typesCount " + typesCount);
        
        final Map<Type, Optional<Dish>> mostCaloricByType = menu.stream()
                .collect(Collectors.groupingBy((final Dish d) -> d.getType(),
                        Collectors.maxBy(Comparator.comparingInt(Dish::getCalories))));
        System.out.println("mostCaloricByType " + mostCaloricByType);
        
        //Collectors.collectingAndThen Finding the highest-calorie Dish in each subgroup
        final Map<Type, Dish> mostCaloricType = menu.stream()
                .collect(Collectors.groupingBy(Dish::getType,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Dish::getCalories)), Optional::get)));
        printResult("mostCaloricType ", mostCaloricType);
        
        //Partitioning
        final Map<Boolean, List<Dish>> partitionedMenu = menu.stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        printResult("partitionedMenu ", partitionedMenu);
        
        //Partitioning with grouping (second collector)
        final Map<Boolean, Map<Type, List<Dish>>> vegetarianDishesByType = 
                menu.stream().collect(Collectors.partitioningBy(Dish::isVegetarian, Collectors.groupingBy(Dish::getType)));
        printResult("vegetarianDishesByType ", vegetarianDishesByType);
    }
    
    private static void printResult(final String message, final Map map) {
        System.out.println(message + map);
    }
}
