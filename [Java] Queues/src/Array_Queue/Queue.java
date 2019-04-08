
package Array_Queue;

/* queue ADT */
public class Queue {
    
    private int arr[];
    private int add_index;
    private int get_index;
    

    /* create a arr  */
    public Queue(int size) {
        this.arr = new int[size];
        this.add_index = 0;
        this.get_index = 0;
    }
    
    
    public void enqueue(int element){ // add()
        
        if (this.add_index < this.arr.length){
            this.arr[this.add_index] = element;
            this.add_index++;            
        }else{
            throw new IndexOutOfBoundsException("Invalid Index in Queue");
        }

    }
    
    
    public int dequeue(){ // get()
        
        if (this.get_index < this.add_index){
            int val = this.arr[this.get_index];
            this.get_index++;
            return (val);
        }else{
            throw new IndexOutOfBoundsException("Invalid Index in Queue");
        }

    }
    
    
    public int peek(){
        
        if (this.get_index < this.add_index){
            int val = this.arr[this.get_index];
            return (val);
        }else{
            throw new IndexOutOfBoundsException("Invalid Index in Queue");
        }
    }
    
    
    
}
