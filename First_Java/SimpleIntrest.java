// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;

public class SimpleIntrest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
       System.out.println("Enter the principal: ");
        double principal = scanner.nextDouble();

        System.out.println("Enter the Time: ");
        int time = scanner.nextInt();

        System.out.println("Enter the Rate: ");
        double rate = scanner.nextDouble();
         System.out.println();

       double SI = (principal * rate * time ) / 100;

       System.out.println("The Simple intrest is: " + SI); 

    }
}