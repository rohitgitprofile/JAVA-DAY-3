import java.util.Scanner;
public class StreamOfNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, sum=0;
        System.out.println("Start Entering the numbers you want to add and enter -1 when you want to stop the addition and see the result");
        num=sc.nextInt();
        while(num!=-1){
            sum+=num;
            num=sc.nextInt();
        }
        System.out.println(sum);
    }
}