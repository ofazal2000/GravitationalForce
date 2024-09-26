/*
 * Write the Palindrome program inside the main method
 * according to the assignment description.
 * 
 * To compile:
 *        javac Palindrome.java
 * To execute:
 *        java Palindrome 5 4 6 6 4 5
 * 
 * DO NOT change the class name
 * DO NOT use System.exit()
 * DO NOT change add import statements
 * DO NOT add project statement
 * 
 */

public class Palindrome {
    public static void main(String[] args) {
       
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        int num4 = Integer.parseInt(args[3]);
        int num5 = Integer.parseInt(args[4]);
        int num6 = Integer.parseInt(args[5]);

        boolean Palindrome = (num1 == num6) && (num2 == num5) && (num3 == num4); 
        
        System.out.println(Palindrome);



    }
}
