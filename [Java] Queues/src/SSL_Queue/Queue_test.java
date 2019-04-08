
package SSL_Queue;


public class Queue_test {


    public static void main(String[] args) {
        
        Queue q = new Queue(11.11);
        q.enqueue(22.22);
        q.enqueue(33.33);
        q.enqueue(44.44);
        q.enqueue(55.55);
        
        System.out.println(q.peek());
        
        
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        //System.out.println(q.dequeue());
        
        
        
        
        
        
        
        
        
    }
    
}
