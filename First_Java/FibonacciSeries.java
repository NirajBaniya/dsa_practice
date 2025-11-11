
// To calculate Fibonacci Series up to n numbers.
   

   import java.util.Scanner;


public class FibonacciSeries{
 
    public static void main(String[]  args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number for fibo: " + num);
        int num = scanner.nextInt();
        
         int a = 0 ;
          int  b = 1;

      

      for(int i = 0; i<num; i++){
         
         System.out.println("The fibo is: " + num);
         int nextTerm = a + b; 
          a =b;
          b = nextTerm;

        
      }

    }
}