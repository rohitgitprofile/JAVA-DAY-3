import java.util.Scanner;
public class PrintSumOfNNaturalNumberWithForLoop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, sum=0;
        System.out.println("Enter how many times you want to print sum of natural number from 1");
        a=sc.nextInt();
        System.out.println("Printing " + a + " sum of natural numbers from 1");
        for(int n=1;n<=a;n++){
            sum+=n;
        }
        System.out.println(sum);
    }
}