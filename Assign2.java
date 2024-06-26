// Write a function to print the sum of all odd numbers from 1 to n.

import java.util.*;
public class Assign2 {

    public static void printOdd (int n){
        int sum = 0 ;
        for(int i=0; i<=n ; i++){
            if(i%2!=0){
                sum = sum + i ;
            }
        }
        System.out.println(sum);
        return ; 
    }
   public static void main (String args []){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the Numbers :");
    int n = sc.nextInt();
    System.out.println("The sum is :");
    printOdd(n);
   }
    
}
