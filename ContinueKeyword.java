import java.util.Scanner;
public class ContinueKeyword{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = 1, num2=1;
                // printing all natural numbers from 1 to 10 but not 3
        for(; num1<=10;num1++){
            if(num1%3==0){
                continue;
            }
            System.out.println(num1);
        }
        while(num2<=10){
            if(num2%3==0){
                num2++;
                continue;
            }
            System.out.println(num2);
            num2++;
        }
    }

}