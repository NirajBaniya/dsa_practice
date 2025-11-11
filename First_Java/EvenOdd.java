// Write a program to print whether a number is even or odd, also take input from the user.
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num =  scanner.nextInt();
        System.out.println();

        if(num % 2 == 0) {
            System.out.println( num + " is even.");
        }
        else{
           System.out.println( num + " is odd.");
        }


    scanner.close();
    }
}