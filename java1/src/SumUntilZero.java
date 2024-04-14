import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the numbers:");
        int sum=0;
        while(true){
            int num=in.nextInt();
            if(num==0){
                break;
            }
            else{
                sum=sum+num;
            }

        }
        System.out.println("sum = "+sum);
    }
}
