public class MethodTwo {
    public void login(){
        System.out.println("Login completed");
    }
    public void logout(){
        System.out.println("Loggedout");
    }
    public static void main(String args[]){
    System.out.println("Company Login");
    MethodTwo obj=new MethodTwo();
    obj.login();
    }
}
