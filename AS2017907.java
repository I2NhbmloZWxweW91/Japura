
package as2017907;

public class AS2017907 {

    
    public static void main(String[] args) {
        
        int[] arr = {15, 19, 10, 7, 17, 16, 8};
        
        Heap heap = new Heap(arr);
        
        //System.out.println(heap.get_left_child(2));
        //System.out.println(heap.get_right_child(2));
        //System.out.println(heap.get_index_of_parent(4));
        heap.heapify();
        heap.print_all();

    }
    
    
// Implement a function to heapify the given binary tree (in an array structure)
//    public static void heapify(Heap heap){
//        int child = heap.get_last();
//        int parent_index = heap.get_index_of_parent(heap.get_size() - 1);
//
//        for (int i=1; i<= heap.get_size()-1; i++){      
//            if (heap.get_value(parent_index) < child || heap.get_value(parent_index) < heap.get_left_child(parent_index)){
//                if (heap.get_left_child(parent_index) > heap.get_right_child(parent_index))
//                    heap.swap_with_left(parent_index);
//                else
//                     heap.swap_with_right(parent_index);            
//            }  
//            parent_index = heap.get_index_of_parent(heap.get_size() - i);
//        }
//
//        heap.print_all();
//    }
 
}
