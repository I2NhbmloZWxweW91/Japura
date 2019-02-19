/*
A simple implementation for `stack` ADT using Vector in Java
*/

/* imports */
import java.util.Vector;


public class Stack<Object>{
    
    Vector stack_vector;
    
    public Stack(){
        this.stack_vector = new Vector();
    }
    
    
    public void push(Object obj){
        this.stack_vector.add(obj);
    }
    
    
    public Object peek(){
        Object last_obj = (Object) this.stack_vector.get(this.stack_vector.size() - 1);
        return (last_obj);
    }
    
    
    public Object pop(){
        Object last_obj  = peek();
        this.stack_vector.remove(this.stack_vector.size() - 1);
        return (last_obj);
    }
    
    
    public boolean empty(){
        if (this.stack_vector.isEmpty()) return true;
        return false;
    }
    
}
