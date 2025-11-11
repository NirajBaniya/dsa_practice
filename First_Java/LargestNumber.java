// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      System.out.println("Enter the vlaue of a: "); 
      int a = scanner.nextInt();

      System.out.println("Enter the value of b: ");
      int b = scanner.nextInt();

      System.out.println();

      if(a > b) {
        System.out.println("A is greater.");
      }
      else {
        System.out.println("B is greater.");
      }


     
    }
}