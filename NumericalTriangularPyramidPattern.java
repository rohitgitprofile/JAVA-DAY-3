import java.util.Scanner;
public class NumericalTriangularPyramidPattern{
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
                if(i==1 || i==r || k==1 || k==((2*i)-1)){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}