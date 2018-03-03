/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_patterns.observer;

import design_patterns.observer.subscribers.Guardian;
import design_patterns.observer.subscribers.LeMonde;
import design_patterns.observer.subscribers.NYTimes;

/**
 *
 * @author webpr
 */
public class ObserverPattern {
    
    public static void main(String[] args) {
        final Feed f = new Feed();
        
        f.registerSubscriber(new NYTimes());
        f.registerSubscriber(new Guardian());
        f.registerSubscriber(new LeMonde());
        
        //With lambdas
        f.registerSubscriber((final String tweet) -> {
            if (tweet != null && tweet.contains("money")) {
                System.out.println("Breaking news in NY! " + tweet);
            }
        });
        f.registerSubscriber(new Guardian());
        f.registerSubscriber(new LeMonde());
        
        f.notifySubscribers("The money said her favourite book is Java 8 in Action!");
        
        f.unregisterSubscriber(new NYTimes());
        f.unregisterSubscriber(new Guardian());
        f.unregisterSubscriber(new LeMonde());
    }
}
