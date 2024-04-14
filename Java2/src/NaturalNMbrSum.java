import java.util.Scanner;

public class NaturalNMbrSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        int SUM=Sum(num);
        System.out.println("Sum = "+SUM);
    }
    static int Sum(int num){
        int sum=0;
        if(num>0){
            sum=num+Sum(num-1);
        }

//        for(int i=1;i<=num;i++){
//            sum=sum+i;
//        }
        return sum;
    }
}
