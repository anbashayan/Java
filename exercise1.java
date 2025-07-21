import java.util.Scanner;

public class exercise1 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = input.nextLine();
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("My name"+name);
        System.out.println("Your age is "+age);
    }
}