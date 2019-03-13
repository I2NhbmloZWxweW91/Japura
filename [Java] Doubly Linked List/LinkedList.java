package dll;

class LinkedList{

    Node node;

    
    public LinkedList(double value){
        this.node = new Node(value, null, null);
    }

    
    public void addToFront(double value){
        Node new_node = new Node(value, null, this.node);
        this.node.before = new_node;
        this.node = new_node;
        
    }

    
    public void addToEnd(double value){
        Node temp_node = this.node;
        while(true){            
            if (temp_node.next == null) break; 
            temp_node = temp_node.next;
        }
        Node new_node = new Node(value, temp_node, null);
        temp_node.next = new_node;
    }
   
    
    public void addBefore(double value, double new_value){
        Node temp_node = this.node;
        while (true){
            if (temp_node.value == value) break;
            temp_node = temp_node.next;
        }
        Node before = temp_node.before;
        Node new_node = new Node(new_value, before, temp_node);
        before.next = new_node;
        temp_node.before = new_node;
    }
    
    
    public void addAfter(double value, double new_value){
        Node temp_node = this.node;
        while (true){
            if (temp_node.value == value) break;
            temp_node = temp_node.next;
        }
        Node next = temp_node.next;
        Node new_node = new Node(new_value, temp_node, next);
        next.before = new_node;
        temp_node.next = new_node;
    }
    
    
    public void deleteFront(){
        this.node = this.node.next;
        this.node.before = null;
    }
    
    
    public void deleteEnd(){
        Node temp_node = this.node;
        while(true){            
            if (temp_node.next == null) break; 
            temp_node = temp_node.next;
        }
        temp_node.before.next = null;
    }
    
    
    public void deleteElement(double value){
        Node temp_node = this.node;
        while (true){
            if (temp_node.value == value) break;
            temp_node = temp_node.next;
        }
        temp_node.before.next = temp_node.next;
        temp_node.next.before = temp_node.before;
    }
    
    
    /* additional method to print all elements */
    public void print_all(){
        Node temp_node = this.node;  
        while (true){
            try{
                System.out.println("value=" + temp_node.value
                        +", "+"before="+temp_node.before
                        +", "+"next="+temp_node.next);
                temp_node = temp_node.next;
            }catch(Exception exp){
                break;
            }
        }
    }
}