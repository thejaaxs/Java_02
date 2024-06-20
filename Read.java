import java.util.*;
public class Read {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter The Floating Point Number :");
        float n = sc.nextFloat();
        if(n==0){
            System.out.println("Zero");
        }
        else if(n<1){
            System.out.println("Small");
        }
        else if(n>100000){
            System.out.println("Large");
        }
        else {
            System.out.println("positive");
        }
    }
}
