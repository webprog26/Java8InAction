/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_patterns.observer.chain_of_responsibility;

/**
 *
 * @author webpr
 */
public abstract class ProcessingObject<T> {
    
    protected ProcessingObject<T> successor;

    public void setSuccessor(ProcessingObject<T> successor) {
        this.successor = successor;
    }
    
    public T handle(final T input) {
        T r = handleWork(input);
        if (successor != null) {
            return successor.handle(r);
        }
        
        return r;
    }
    
    abstract protected T handleWork(T input);
}
