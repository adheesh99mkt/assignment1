import java.util.Scanner;

public class CountOfRepeated{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String number=in.next();
        char n=in.next().charAt(0);

        int count=0;
        for(int i=0;i<number.length();i++){
            char num=number.charAt(i);

            if(num==n){
                count++;
            }
        }
        System.out.println(count);

//        int count=0;
//        while(number>0){
//            if(number%10==n){
//                count++;
//            }
//            number=number/10;
//
//        }
//        System.out.println(count);
    }
}