// Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.*;
public class Assign3 {
    public static void greatOfTwo(int a , int b){
        if(a==b){
            System.out.println("Equal");
        }
        else if(a>b){
            System.out.println(a+" is greater than b "+b);
        }
        else{
            System.out.println(b+" is greater than "+a);
        }
    }
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Two numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt () ; 
        greatOfTwo(a,b);
    }
}
