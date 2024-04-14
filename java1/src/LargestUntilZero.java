import java.util.Scanner;

public class LargestUntilZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int large=0;
        System.out.println("enter the numbers");
        while(true){
            int num=in.nextInt();
            if(num!=0){
                if(num>large){
                    large=num;
                }
            }
            else{
                break;
            }

        }
        System.out.println("large number is "+large);
    }
}
