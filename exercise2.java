import java.util.Scanner;

public class exercise2{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = input.nextLine();
        System.out.println("Enter Your Age");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Enter Your Address");
        String address = input.nextLine();
        System.out.println("My name is "+name);
        System.out.println("My age is "+age);
        System.out.println("My address is "+address);
    }
}