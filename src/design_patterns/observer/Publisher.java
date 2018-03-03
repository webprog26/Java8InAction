/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_patterns.observer;

/**
 *
 * @author webpr
 */
public interface Publisher {
    void registerSubscriber(final Subscriber s);
    void notifySubscribers(final String tweet);
    void unregisterSubscriber(final Subscriber s);
}
