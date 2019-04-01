
package javaapplication57;

import java.util.Stack;


class Hanoi2 {
        
     public static void main(String args[]) {
          
          long startTime = System.nanoTime();

  
          
          
          
           Stack<Integer> A = new Stack<Integer>();
           Stack<Integer> B = new Stack<Integer>();
           Stack<Integer> C = new Stack<Integer>();
           int n = 29; // Number of disks
          
          /* set starting disks in A */
          for (int i = n; i > 0; i--){
               A.push(i);
          }
          
          //for (Integer x: A) System.out.println(x);
          System.out.println("Stack A = " + A);
          towerOfHanoi(n, A,  C, B); // A, B and C are names of rods
          //for (Integer x: C) System.out.println(x);
          System.out.println("Stack C = " + C);
          
          double endTime = System.nanoTime();
          double duration = ((endTime - startTime)/1000000);  //divide by 1000000 to get milliseconds.        
          System.out.println("Time taken = " + duration);
          
     }
     
     // Java recursive function to solve tower of hanoi puzzle
     static void towerOfHanoi(int n, Stack<Integer> from_rod, Stack<Integer> to_rod, Stack<Integer> aux_rod) {
          if (n == 1) {
               //System.out.println("Move disk 1 from rod " + from_rod + " to rod " + to_rod);
               Integer poped_val = from_rod.pop();
               to_rod.push(poped_val);
               return;
          }
          
          towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
          //System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod);
          Integer poped_val = from_rod.pop();
          to_rod.push(poped_val);
          towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
     }



}
