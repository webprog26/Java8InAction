/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author webpr
 */
public class Feed implements Publisher {
    
    private final List<Subscriber> subscribers = new ArrayList<Subscriber>();

    @Override
    public void registerSubscriber(Subscriber s) {
        this.subscribers.add(s);
    }

    @Override
    public void notifySubscribers(String tweet) {
        subscribers.forEach((final Subscriber s) -> s.notify(tweet));
    }

    @Override
    public void unregisterSubscriber(Subscriber s) {
        this.subscribers.remove(s);
    }
    
    
    
}
