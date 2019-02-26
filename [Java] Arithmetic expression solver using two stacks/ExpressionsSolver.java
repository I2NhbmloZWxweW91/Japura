
package expressionssolver;

import java.util.Stack;

public class ExpressionsSolver {


    public static void main(String[] args) {
        
        /* creating two stacks */
        Stack<Integer> numbers = new Stack<Integer>();
        Stack<String> operations = new Stack<String>();
        operations.push("+");
        
        String str = "12 / 4 * 2 - 4 * 2 - 1";
        String str_arr[] = str.split(" ");
        
        for (String each_str: str_arr){
            
            
            try{
                Integer temp_int = Integer.parseInt(each_str);
                numbers.push(temp_int);
                
            /* if each_str is a operation */    
            }catch(Exception exp){
                // get previous operation and check whether each_str has more priority
                String temp_str = operations.peek();
                // if each_str has high priority
                if (get_priority(temp_str) < get_priority(each_str)){
                    operations.push(each_str);
                }
                
                // if each_str has low priority
                else {
                    for (int i=0; i<operations.size()-1; i++){
                        String temp_str2 = operations.pop();
                        Integer val1 = numbers.pop();
                        Integer val2 = numbers.pop();
                        Integer solved_val = cal_value(temp_str2, val1, val2);
                        numbers.push(solved_val);
                        operations.push(each_str);
                    }

                    
                }
                
            }
        }
        
        if (numbers.size() - 1 > 0){
            for (int i=0; i<operations.size()-1; i++){
                String temp_str2 = operations.pop();
                Integer val1 = numbers.pop();
                Integer val2 = numbers.pop();
                Integer solved_val = cal_value(temp_str2, val1, val2);
                numbers.push(solved_val);
            }
        }
        
        
        
        
        
        for (Integer _int : numbers) System.out.println(_int);
        System.out.println("- - - - - -");
        for (String _str : operations) System.out.println(_str);
        
        
        
        
        
        
        
        
    }
    
    /* do the damn operation */
    public static Integer cal_value(String str, int val1, int val2){
        switch(str){
            case "+":
                return (val2 + val1);
            case "-":
                return (val2 - val1);
            case "*":
                return (val2 * val1);
            case "/":
                return (val2 / val1);
        }
        
        return -1;
    }
    
    
    /* get priority of an operation */
    public static int get_priority(String str){
        if (str.equals("*") || str.equals("/"))
            return 1;
        else if (str.equals("+") || str.equals("-"))
            return 0;
        
        return -1;
    }
    
    
    
    
    
}
