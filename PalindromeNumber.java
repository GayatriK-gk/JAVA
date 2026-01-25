public class PalindromeNumber {
    public static void main(String args[]){
        int num=122;
        int original=num;
        int rev=0;
        while(num>0){
            int digit=num%10;
            rev=rev=rec*+10;
            num=num/10;
        }
        if(original==rev){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome Number");
        }

    }
    
}
