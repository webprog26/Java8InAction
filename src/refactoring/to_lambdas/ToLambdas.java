/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring.to_lambdas;

/**
 *
 * @author webpr
 */
public class ToLambdas {
    
    public static void main(String[] args) {
//        final Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello!");
//            }
//        };
//        Runnable r = () -> System.out.println("Hello!");
//        r.run();
//        doSomething(new Task() {
//            @Override
//            public void execute() {
//                System.out.println("Danger!");
//            }
//        });
        doSomething((Task) () -> System.out.println("Danger"));
    }
    
    interface Task {
        void execute();
    }
    
    private static void doSomething(final Runnable r) {
        r.run();
    }
    
    private static void doSomething(final Task t) {
        t.execute();
    }
}
