package SSL_Queue;


public class Queue {
    
    private LinkedList ld;

    public Queue(double val) {
        this.ld = new LinkedList(val);
    }
    
    
    public void enqueue(double val){
        this.ld.addToEnd(val);
    }
    
    
    public double dequeue(){
        double val = this.ld.getFront();
        return (val);
    }
    
    
    public double peek(){
        return(ld.peek());
    }
    
    
    
    
    
}
