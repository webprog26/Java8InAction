/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams.practice;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author webpr
 */
public class TransactionsManager {
    
    public static List<Transaction> getTransactionsByYear(final List<Transaction> origin, final int year) {
        return origin.stream()
                .filter(t -> t.getYear() == year)
                .sorted((t1, t2) -> Integer.compare(t1.getValue(), t2.getValue()))
                .collect(Collectors.toList());
    } 
    
    public static List<String> getUniqueCities(final List<Transaction> origin) {
        return origin.stream()
                .map(t -> t.getCity())
                .distinct()
                .collect(Collectors.toList());
    }
    
    public static List<String> getTradersByCity(final List<Transaction> origin, final String city) {
        return origin.stream()
                .filter(t -> t.getCity().equals(city))
                .map(t -> t.getTraderName())
                .sorted((t1, t2) -> Integer.compare(Integer.valueOf(t1.charAt(0)), Integer.valueOf(t2.charAt(0))))
                .collect(Collectors.toList());
    }
    
    public static String getAllTheTradersNames(final List<Transaction> origin) {
        final StringBuilder builder = new StringBuilder();
                origin.stream()
                .map(t -> t.getTraderName())
                .sorted((t1, t2) -> Integer.compare(Integer.valueOf(t1.charAt(0)), Integer.valueOf(t2.charAt(0))))
                .forEach(s -> builder.append(s + " "));
        return builder.toString();
    }
    
    public static boolean haveTradersInCity(final List<Transaction> origin, final String city){
        return origin.stream().anyMatch(t -> t.getCity().equals(city));
    }
    
    public static void printTransactionsByCity(final List<Transaction> origin, final String city){
        origin.stream()
                .filter(t -> t.getCity().equals(city))
                .map(t -> t.getValue())
                .forEach(System.out::println);
    }
    
    public static int getHighestTransactionValue(final List<Transaction> origin){
        return origin.stream()
                .map(t -> t.getValue())
                .reduce(Integer::max)
                .get();
    }
    
     public static int getSmallestTransactionValue(final List<Transaction> origin){
        return origin.stream()
                .map(t -> t.getValue())
                .reduce(Integer::min)
                .get();
    }
}
