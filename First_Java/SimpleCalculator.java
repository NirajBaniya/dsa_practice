// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the First Number: ");
       double a = scanner.nextDouble();

       System.out.println("Enter the Operator:(+,-,*,/) ");
       char operator = scanner.next().charAt(0);

       

       System.out.println("Enter the Second Number: ");
       double b = scanner.nextDouble();
      System.out.println();

      double ans = 0;

       if(operator == '+'){
         ans = a + b;
       }

       else if(operator == '-'){
         ans = a - b;
       }

       else if(operator == '*') {
          ans = a * b;
       }

       else if(operator == '/'){
          ans = a / b;
       }
       else{
         System.out.println("Oops!! Something went wrong.");
       }
     
     System.out.println("The result is: " + ans);
      
       scanner.close();
    }
}