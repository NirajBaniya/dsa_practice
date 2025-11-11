// Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

 public class Greeting {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = scanner.nextLine();
        
        System.out.println();
        System.out.println("Hello " + name + " Good Morning!!");

    }
 }