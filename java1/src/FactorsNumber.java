import java.util.Scanner;

public class FactorsNumber {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int num = inp.nextInt();
        int i=1;
        System.out.println("factors of "+num);
        while(num>=i){
            if(num%i==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
