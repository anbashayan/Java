package questions;
import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner digit = new Scanner(System.in);
        System.out.println("Enter Your Income :");
        int income = digit.nextInt();

        if(income > 7000){
            System.out.println("You are eligible for scholorship");
        }
        else{
            System.out.println("Not eligible for scholorship");
        }
}
}
