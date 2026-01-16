import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=0,b=1,c,num=8;
        System.out.println("Enter the number of terms you want to print fibonnaci series");
        num=sc.nextInt();
        System.out.print(a + " " + b + " ");
        while((num-2)!=0){
            c=a+b;
            System.out.print(c + " ");
            a=b;
            b=c;
            num--;
        }
    }
}