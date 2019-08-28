/*
(Palindrome integer) Write the methods with the following headers

// Return the reversal of an integer, i.e., reverse(456) returns 654
public static int reverse(int number)

// Return true if number is a palindrome
public static boolean isPalindrome(int number)

Use the reverse method to implement isPalindrome. A number is a palindrome
if its reversal is the same as itself. Write a test program that prompts the
user to enter an integer and reports whether the integer is a palindrome.
*/
import java.util.Scanner;
public class Reverse {
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      long A = input.nextLong();
      System.out.println(sumDigits(A));
      System.out.println(reverse(A));
      if (isPalindrome(A))
         System.out.println("Is PAlindrome");
      else
         System.out.println("Is not PAlindrome");
      
   }
      /*public static long sumDigits(long n){
         long rem=0;
         long sum =0;
         while(n>0){
            rem= n%10;
            sum=rem+sum;
            n=n/10;
         }
         return sum;
      } */
      
      public static long reverse(long n){
         long rem=0;
         long sum =0;
         while(n>0){
            rem= n%10;
            sum=rem+sum*10;
            n=n/10;
         }
         return sum;
      }
      
      public static boolean isPalindrome(long  number){
         if ( number != reverse(number))
            return false;
        return true;
      } 
            
            
}
