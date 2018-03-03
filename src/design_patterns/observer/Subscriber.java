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
public interface Subscriber {
    void notify(final String tweet);
}
