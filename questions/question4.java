package questions;
import java.util.Scanner;

public class question4 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = input.nextInt();

        if(num % 2 ==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
}
