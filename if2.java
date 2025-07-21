import java.util.Scanner;
public class if2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        String status = input.nextLine();
        if(status == "dead"){
            System.out.println("Surya meets Ramya");
        }
        else{
            System.out.println("Surya weds Meghna");
        }
    }
}
