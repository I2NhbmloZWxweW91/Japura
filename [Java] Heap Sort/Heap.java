
package as2017907;


public class Heap {
    
    int[] heap;
    
    public Heap(int[] heap_arr){
        this.heap = heap_arr;
    }
    
    /* method to get left child for given parent index */
    public int get_left_child(int index){
        return (this.heap[2* index + 1]);  
    }
    
    /* method to get right child for given parent index */
    public int get_right_child(int index){
        return (this.heap[2* index + 2]);  
    }
    
    // Implement a function to find the index of the parent for given index of a node. 
    public int get_index_of_parent(int index){
        return ((index - 1) / 2);
    }
    
   
    public int get_last(){
        return (this.heap[this.heap.length - 1]);
    }
    
    public int get_size(){
        return (this.heap.length);
    }
    
    
    public int get_value(int index){
        return (this.heap[index]);
    }
    
    
    public void swap_with_left(int parent_index){
        int temp = this.heap[parent_index];
        this.heap[parent_index] = get_left_child(parent_index);
        this.heap[2* parent_index + 1] = temp;
    }
    
    public void swap_with_right(int parent_index){
        int temp = this.heap[parent_index];
        this.heap[parent_index] = get_right_child(parent_index);
        this.heap[2* parent_index + 2] = temp;
    }
    
    public void print_all(){
        for (int val: this.heap) System.out.println(val);
    }
    
    
    public void heapify(){
        for (int ki=0; ki<3; ki++){
        for (int i=this.heap.length-1; i>=0; i--){
            //System.out.println("child = "  + this.heap[i] + " parent = "  + this.heap[get_index_of_parent(i)]);
            if (this.heap[get_index_of_parent(i)] < this.heap[i]){
                int temp = this.heap[get_index_of_parent(i)];
                this.heap[get_index_of_parent(i)] = this.heap[i];
                this.heap[i] = temp;
            } 
        }
        }
    }
    
    
    public void heapsort(){
        
        for (int n=this.heap.length; n>=1; n--){
            
        }
        
        
        
        
    }
    
    
    
    
    
    
    
    
}
