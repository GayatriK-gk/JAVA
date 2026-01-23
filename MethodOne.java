public class MethodOne {
    
        public void m1(){
            System.out.println("m1 called");
        }
        public void m2(){
            System.out.println("m2 called");
        }
    public static void main(String args[]){
        MethodOne obj=new MethodOne();
        obj.m1();
        obj.m2();
    }
}
