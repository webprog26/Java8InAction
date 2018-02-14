/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor_references.with_own_functional_interface;

/**
 *
 * @author webprog26
 */
public interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}
