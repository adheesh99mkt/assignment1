import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number :");
        int num = in.nextInt();
        EvenOdd(num);
    }
    static void EvenOdd(int a){

        if(a%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
