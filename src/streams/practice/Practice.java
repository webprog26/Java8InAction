/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author webpr
 */
public class Practice {
    
    public static void main(String[] args) {
        final List<Transaction> transactions = Arrays.asList(
                new Transaction(ThreadLocalRandom.current().nextLong(100), ThreadLocalRandom.current().nextInt(2000), "Toronto", "Lou", 2011),
                new Transaction(ThreadLocalRandom.current().nextLong(100), ThreadLocalRandom.current().nextInt(2000), "New Yourk", "Ann", 2012),
                new Transaction(ThreadLocalRandom.current().nextLong(100), ThreadLocalRandom.current().nextInt(2000), "Los Andgeles", "Joe", 2011),
                new Transaction(ThreadLocalRandom.current().nextLong(100), ThreadLocalRandom.current().nextInt(2000), "Atlanta", "Cally", 2017),
                new Transaction(ThreadLocalRandom.current().nextLong(100), ThreadLocalRandom.current().nextInt(2000), "Detroit", "Mike", 2011),
                new Transaction(ThreadLocalRandom.current().nextLong(100), ThreadLocalRandom.current().nextInt(2000), "Vancouver", "Helen", 2009),
                new Transaction(ThreadLocalRandom.current().nextLong(100), ThreadLocalRandom.current().nextInt(2000), "Toronto", "Rebecka", 2005),
                new Transaction(ThreadLocalRandom.current().nextLong(100), ThreadLocalRandom.current().nextInt(2000), "Toronto", "Olga", 2018)
        );

//        System.out.println("1. Find all transactions in the year 2011 and sort them by value (small to high).");
//        TransactionsManager.getTransactionsByYear(transactions, 2011).forEach(System.out::println);
//        System.out.println("2. What are all the unique cities where the traders work?");
//        TransactionsManager.getUniqueCities(transactions).forEach(System.out::println);
//        System.out.println("3. Find all traders from Cambridge and sort them by name.");
//        TransactionsManager.getTradersByCity(transactions, "Toronto").forEach(System.out::println);
//        System.out.println("4. Return a string of all traders’ names sorted alphabetically.");
//        System.out.println(TransactionsManager.getAllTheTradersNames(transactions));
//        System.out.println("5. Are any traders based in Toronto?");
//        System.out.println(TransactionsManager.haveTradersInCity(transactions, "Toronto"));
//        System.out.println("6. Print all transactions’ values from the traders living in Toronto?");
//        TransactionsManager.printTransactionsByCity(transactions, "Toronto");
//        System.out.println("7. What’s the highest value of all the transactions?");
//        System.out.println(TransactionsManager.getHighestTransactionValue(transactions));
        System.out.println("8. Find the transaction with the smallest value");
        System.out.println(TransactionsManager.getSmallestTransactionValue(transactions));
    }
}
