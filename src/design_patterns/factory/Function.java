/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_patterns.factory;

/**
 *
 * @author webpr
 */
public interface Function<T, U> {
    U apply(T t);
}
