import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num  = in.nextInt();
        Prime(num);

    }
    static void Prime(int num){
        if(num>2){
            for(int i=2;i<num;i++){
                if(num%i==0){
                    System.out.println("not prime");
                    break;
                }
                if(i==num-1){
                    System.out.println("prime");
                }
            }


        } else if (num==2) {
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}
