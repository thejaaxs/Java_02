// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

import java.util.* ;
public class Assign5 {
    public static void isVote(int age ){
        if(age>18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not-Eligible to vote");
        }
    }
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the age : ");
        int age = sc.nextInt() ; 
        isVote(age);
    }
}
