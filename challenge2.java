import java.util.Scanner;

public class challenge2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Marks : ");
        int Mark = input.nextInt();
        if(Mark>35){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}
