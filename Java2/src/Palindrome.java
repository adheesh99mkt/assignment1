import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number=in.nextInt();
        Pal(number);

    }
    static void Pal(int n){
        int count=0;
        String num=Integer.toString(n);
        for(int i=0;i<=num.length()/2;i++){
            if(num.charAt(i)!=num.charAt(num.length()-1-i)){
                System.out.println("not palindrom");
                break;
            }
            else{
                count++;
            }
            if(count==num.length()/2){
                System.out.println("palindrome");
        }

        }
    }
}
