// Input currency in rupees and output in USD.

import java.util.Scanner;

public class CurrencyConverter {
    
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Enter the Rupees: ");
       double rupees = scanner.nextDouble();
        
        System.out.println();

        double USD = rupees / 140;

        System.out.println("The USD is: $" + USD);
      
     


    }
}