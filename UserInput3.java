import java.util.Scanner;
public class UserInput3{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name=s.nextLine();
        System.out.println("Enter your age:");
        int age=s.nextInt();
        System.out.println("Enter your Department:");
        String dept=s.nextLine();
        System.out.println("Enter your Salary:");
        float salary=s.nextFloat();
        System.out.println("Enter your Division:");
        char div=s.next().charAt(0);

        System.out.println("Heyyy!!!"+name);
        System.out.println(name +"Your age is:"+age);
        System.out.println("Your Department is:"+dept);
        System.out.println("Your salary is:"+salary);
        System.out.println("Your division is:"+div);
        System.out.println("Thankyou!!");



    }
}