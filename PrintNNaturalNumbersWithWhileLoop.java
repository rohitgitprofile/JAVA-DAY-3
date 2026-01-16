import java.util.Scanner;
public class PrintNNaturalNumbersWithWhileLoop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,n=1;
        System.out.println("Enter how many natural numbers you want to print from 1");
        a=sc.nextInt();
        System.out.println("Printing " + a + " natural numbers from 1");
        while(n<=a){
            System.out.println(n);
            n++;
        }
    }
}