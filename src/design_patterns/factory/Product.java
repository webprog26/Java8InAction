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
public abstract class Product {
    
    private final String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
