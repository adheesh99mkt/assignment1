import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number = inp.nextInt();
        int temp=0;
        while(number>0){
            int rem=number%10;
            temp=temp*10+rem;
            number=number/10;
        }
        System.out.println(temp);


    }
}
