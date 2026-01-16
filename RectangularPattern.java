import java.util.Scanner;
public class RectangularPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int r,c;
            System.out.println("enter the number of rows in a rectangle start pattern");
            r=sc.nextInt();
        System.out.println("Enter the number of columns in a rectangle star pattern");
        c=sc.nextInt();
        for(;r>0;r--){
            for(int j=c;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}