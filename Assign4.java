// Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.* ; 
public class Assign4 {
    public static void printCircum(int radius){
        float circumference = 2f * 3.142f * radius ;
        System.out.println("The radius is : "+circumference);
    }
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter The Radius :");
        int radius = sc.nextInt() ; 
        printCircum(radius);
    }
}
