/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_patterns.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 *
 * @author webpr
 */
public class FactoryPattern {
    
    public static void main(String[] args) {
//        final Product p = ProductFactory.createProduct("loan");
//        System.out.println(p.getName());

        Map<String, Function<String, Product>> map = new HashMap<>();
        map.put("loan", (t) -> {
            return new Loan(t);
        });
        map.put("stock", (t) -> {
            return new Stock(t);
        });
        map.put("bond", (t) -> {
            return new Bond(t);
        });
        
        map.forEach(new BiConsumer<String, Function<String, Product>>(){
            @Override
            public void accept(String t, Function<String, Product> u) {
                System.out.println(u.apply(t).getName());
            }
            
        });
    }
}
