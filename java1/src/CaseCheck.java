import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //fibonacci
        int n = inp.nextInt();
        int n1=0;
        int n2=1;
        int count=2;
        System.out.print(n1+" "+n2);
        while(count<=n){
            int temp=n2;
            n2=n1+n2;
            n1=temp;
            count++;
            System.out.print(" "+n2);
        }
        //System.out.println(n2);
    }
}
