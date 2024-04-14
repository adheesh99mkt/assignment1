import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
            isPrime(6);
    }

    static void isPrime(int n) {
        if (n <= 1) {
            System.out.println("not prime");
        } else {
            int c = 2;
            if(c<n){
                while (true) {
                    if(n!=c){
                        if (n % c == 0) {
                            System.out.println("not prime");
                            break;
                        }
                        else{
                            c++;
                        }
                    }
                    else {
                        System.out.println("prime");
                        break;
                    }


                }
            }



        }
    }
}
