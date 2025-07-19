import java.lang.System;
import java.util.Scanner;

public class userinput {
    public static void main(String args[]){
        Scanner john = new Scanner(System.in);
        int a = john.nextInt();
        String b = john.nextLine();
        System.out.println(a);
        System.out.println(b);

    }
}
