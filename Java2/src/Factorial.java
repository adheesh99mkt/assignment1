import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        int fact=Fact(num);
        System.out.println("factorial of "+num+" = "+fact);
    }
    static int Fact(int n){
        if(n>1){
            int fact=1;
            fact=n*Fact(n-1);

            
            return fact;
        }
        else{
            return 1;
        }
    }
}
