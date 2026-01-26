public class ConstructorA {
    public ConstructorA(int i){
        System.out.println("Constructor with int arguments");
    }
    public ConstructorA(String str){
        System.out.println("Constructor with String Arguments");
    }
    public ConstructorA(int i, String str){
        System.out.println("Constructor with multiple Arguments");
    }
    public ConstructorA(){
        System.out.println("Constructor with no Arguments");
    }
    public static void main(String args[]){
        ConstructorA c=new ConstructorA(101);
        ConstructorA c1 =new ConstructorA("Oggy");
        ConstructorA c2 =new ConstructorA(11,"Harry");
        ConstructorA c3=new ConstructorA();
    }
}
