/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg907lab05;


public class Main {

    public static void main(String[] args) {
        
        LinkedList ld = new LinkedList(10.5);
        
        ld.addToFront(12.6);
        ld.addToEnd(22.33);
        ld.addToEnd(333.33);
        ld.addToFront(111.6);
        
        ld.print_all();
        System.out.println("- -- - -- - -");
        
        int res = ld.addBefore(10.5, 99.99);
        
        ld.print_all();
        System.out.println("- -- - -- - -");
        
        res = ld.addAfter(22.33, 888.88);
        
        ld.print_all();
        System.out.println("- -- - -- - -");
        
        ld.deleteFront();
        
        ld.print_all();
        System.out.println("- -- - -- - -");
        
        ld.deleteEnd();
        System.out.println("asdfasdfsadf");
        ld.print_all();
        System.out.println("- -- - -- - -");
        
        ld.addToEnd(44.5);
        ld.addToEnd(3435.45);
        ld.print_all();
        System.out.println("- -- - -- - -");
    }
    
    
}
