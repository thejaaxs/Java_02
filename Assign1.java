// Enter 3 numbers from the user & make a function to print their average

import java.util.* ; 
public class Assign1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the numbers :");
        int a = sc.nextInt() ; 
        int b = sc.nextInt() ; 
        int c = sc.nextInt() ; 
        float average = ( a + b + c ) / 3f ; 
        System.out.println("The average is "+average);
    }
}
