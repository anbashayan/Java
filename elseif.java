import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Marks :");
        int marks = input.nextInt();
        if(marks > 35 && marks <60){
            System.out.println("You will get Video game");
        }
        else if(marks >= 60 && marks < 90){
            System.out.println("You will get iPhone");
         }
        else if(marks >= 90 && marks < 100){
            System.out.println("You will get MacBook Pro");
    }
}
}
