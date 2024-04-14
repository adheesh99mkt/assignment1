import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int num1=in.nextInt();
            int num2= in.nextInt();
            int num3= in.nextInt();

            boolean ans=Pyth(num1,num2,num3);
            if(ans){
                System.out.println("Pythagorean");
            }
            else {
                System.out.println("Not Pythagorean");
            }
    }
    static boolean Pyth(int a,int b,int c){
        return a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a;
    }
}