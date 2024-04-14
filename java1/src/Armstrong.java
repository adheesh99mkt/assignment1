import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number : ");
        int number= in.nextInt();
        int num=number;
        int length=String.valueOf(num).length();
        int sum=0;
        while(num>0){
            int digit = num%10;
            sum = (int) (sum + Math.pow(digit, length));
            num=num/10;
        }
        if(number==sum){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
    }
}
