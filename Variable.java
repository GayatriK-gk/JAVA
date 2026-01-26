public class Variable {
    int a=100;
    int b=200;
    public void add(){
        System.out.println("Addition:"+(a+b));
    }
    public void sub(){
        System.out.println("Subtraction:"+(a-b));
    }
    public static void main(String args[]){
        Variable v=new Variable();
        v.add();
        v.sub();
    }
}
