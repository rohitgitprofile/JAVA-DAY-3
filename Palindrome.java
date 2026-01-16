import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, digit, dup, res=0;
        System.out.println("Enter a number");
        num = sc.nextInt();
        dup=num;
        while(num!=0){
            digit=num%10;
            res = (res*10)+digit;
            num/=10;
        }
        if(res==dup){
            System.out.println("It is a palindrome number");
        }
        else{
            System.out.println("It is not a palindrome number");
        }
    }
}