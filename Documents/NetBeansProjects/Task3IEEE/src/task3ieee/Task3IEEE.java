
package task3ieee;

import java.util.Scanner ;
public class Task3IEEE {

    
public static void main(String[] args) {
    UserInput inputs = new UserInput();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the input : ");
    String input = sc.next();
    inputs.setInput(input);
    System.out.println("the output is : \n " +  inputs.getInput());
    
       
    }
    
}
