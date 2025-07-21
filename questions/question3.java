package questions;
import java.util.Scanner;

public class question3 {
    public static void main(String args[]){
        System.out.println("Enter a number");
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        if (num1 %3 ==0 && num1%5 ==0){
            System.out.println("Divisible by both 3 and 5");;
        }
        else{
            System.out.println("Not divisble by both number");
        }
        }
    }