import java.util.Scanner;
public class VotingUser {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=s.nextInt();
        if (age>=18){
            System.out.println("You are eligible for voting");
        }
        else{
            System.out.println("You are not eligible for voting");
        }

    }
}
