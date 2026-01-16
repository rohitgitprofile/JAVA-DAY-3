import java.util.Scanner;
public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        System.out.println("enter the number of rows in a rectangle start pattern");
        r = sc.nextInt();
        for (int i=1; i<=r; i++) {
            for(int j=r; j>=(i-1); j--){
                System.out.print(" ");
            }
            for(int k=((2*i)-1); k>0; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    } 
}