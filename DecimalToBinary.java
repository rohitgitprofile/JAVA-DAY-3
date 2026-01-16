import java.util.Scanner;
public class DecimalToBinary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, digit, res=0, pw=1;
        System.out.println("Enter a number of base 10");
        num = sc.nextInt();
        while(num!=0){
            digit = num%2;
            res = res+(pw*digit);
            pw*=10;
            num/=2;
        }
        System.out.println("Above number in binary number " + res);
    }
}