
package dll;


public class DLL {

    public static void main(String[] args) {
        
        LinkedList dll = new LinkedList(22.22);
        dll.addToFront(11.11);
        dll.addToEnd(33.33);
        dll.addToEnd(444.33);
        dll.addToFront(555.5);
        
        dll.addBefore(22.22, 101.101);
        dll.addBefore(33.33, 111.11);
        dll.addToFront(999.9);
        dll.addAfter(101.101, 222.222);
        dll.deleteFront();
        dll.deleteEnd();
        dll.deleteElement(111.11);
        dll.print_all();
               
        
    }
    
}
