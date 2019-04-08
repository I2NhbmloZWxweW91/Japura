
package SSL_Queue;


// this will wrap Node class 
public class LinkedList {
    
    Node node;
    
    public LinkedList(double value) {
        this.node = new Node(value, null);
    }
    
    
    public void addToFront(double value){
        Node new_node = new Node(value, this.node);
        this.node = new_node;
        
    }
    

    public void addToEnd(double value){
        
        Node temp_node = this.node;
        
        while (temp_node.next != null){
            temp_node = temp_node.next;
        }
        temp_node.next = new Node(value, null);

    } 
    

    

    public int addBefore(double value, double node_val){

        Node before_node = null;
        Node inject_node;
        Node temp_node = this.node; 
        
        while (true){
            try{
                if (temp_node.value == value){
                    inject_node = new Node(node_val,temp_node);
                    break;
                }
                before_node = temp_node;
                temp_node = temp_node.next;
            } catch(Exception exp){
                return -1;
            }
        }
        before_node.next = inject_node;
        return 1;
    }
    
    
    public int addAfter(double value, double node_val){
        
        Node inject_node;
        Node temp_node = this.node; 
        
        while (true){
            try{
                if (temp_node.value == value){
                    inject_node = new Node(node_val,temp_node.next);
                    break;
                }
                temp_node = temp_node.next;
            } catch(Exception exp){
                return -1;
            }
        }
        temp_node.next = inject_node;
        return 1;
    }
    
    
    public int deleteFront(){
        try{
            this.node = this.node.next;
            return 1;
        }catch(Exception exp){
            return -1;
        }
    }
    
    
    public double getFront(){
        double front_val = this.node.value;
        deleteFront();
        return front_val;
    }
    
    public double peek(){
        return (this.node.value);
    }
    
    
    public void deleteEnd(){
 
        Node temp_node = this.node;
        while (temp_node.next.next != null){
            temp_node = temp_node.next;
        }
        temp_node.next = null;
    }

    public void delete(double value){
        Node temp_node = this.node;
        while(temp_node.next.value != value){
            temp_node = temp_node.next;
        }
        temp_node.next = temp_node.next.next;
    }
    
    
    /* additional method to print all elements */
    public void print_all(){
        Node temp_node = this.node;  
        while (true){
            try{
                System.out.println(temp_node.value);
                temp_node = temp_node.next;
            }catch(Exception exp){
                break;
            }
        }
    }
    
    
    
}
