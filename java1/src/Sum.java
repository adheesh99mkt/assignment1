import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the numbers");
        int num1=in.nextInt();
        int num2=in.nextInt();
        int sum=Sum(num1,num2);
        System.out.println("sum = "+sum);

    }
    static int Sum(int a,int b){
        int sum=a+b;
        return sum;
    }
}
