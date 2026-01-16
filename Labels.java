public class Labels{
    public static void main(String[] args){
        int num = 2, num2=5;
        myloop: while(num>1){
            while(num2>3){
                if(num2==10){
                    break myloop;
                }
                System.out.println(num2);
                num2++;
            }
            System.out.println(num);
            num++;
        }
    }
}
// Labels are  used with break or continue keyword to performs actions on any loop we want and not just the inner most loop.