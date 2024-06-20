//  Write a Java program to get a number from the user and print whether it is positive or negative.

import java.util.*;
public class PosOrNeg {
    public static void main (String arguments []){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter The Number :");
    int n = sc.nextInt();
    if(n>0){
        System.out.println("Positive");
    }
    else if(n<0){
        System.out.println("Negative");
    }
    else{
        System.out.println("Neutral");
    }
    }
}