import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = inp.nextInt();
        int res=1;
        for(int i=1;i<=num;i++){
            res=res*i;
        }
        System.out.println(res);
    }
}
