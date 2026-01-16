import java.util.Scanner;
public class BinaryToDecimal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int binary_num, power=0, base=2, num, digit, num2, res=0;
            System.out.println("Enter an binary number");
            binary_num = sc.nextInt();
            while(binary_num!=0){
                num =(int)Math.pow(base, power);
                digit = binary_num%10;
                num2=num*digit;
                res+=num2;
                power++;
                binary_num/=10;
            }
            System.out.println("In decimal number " + res);
    }
}