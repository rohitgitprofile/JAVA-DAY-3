import java.util.Scanner;
public class ReverseTheNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num,res=0,dig;
        System.out.println("Enter any number");
        num=sc.nextInt();
        while(num!=0){
            dig=num%10;
            res=(res*10)+dig;
            num/=10;
        }
        System.out.println("Reverse of the given number is " + res);
    }
}