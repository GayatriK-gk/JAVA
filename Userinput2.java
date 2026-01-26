import java.util.Scanner;
public class Userinput2{
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name=s.nextLine();
        System.out.println("Enter youe age:");
        int age=s.nextInt();

        System.out.println("Hey..!"+name);
        System.out.println( "your age is:"+ age);
    }
}