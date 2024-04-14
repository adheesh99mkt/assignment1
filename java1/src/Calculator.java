import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int ans=0;
        while (true) {
            ans=0;
            System.out.println("enter the operatot:");
            char op = inp.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("enter two numbers::");
                int n1=inp.nextInt();
                int n2=inp.nextInt();

                if(op=='+'){
                    ans=n1+n2;
                }
                if(op=='-'){
                    ans=n1-n2;
                }
                if(op=='*'){
                    ans=n1*n2;
                }
                if(op=='/'){
                    if(n2!=0){
                        ans=n1/n2;
                    }
                    else{
                        System.out.println("reminder can't be zero");
                    }
                    }
                if(op=='%'){
                    ans=n1%n2;

                }

            } else if (op == 'X' || op == 'x') {
                break;
            } else {
                System.out.println("wrong operation");
            }

            System.out.println("Answer= "+ans);
        }

    }
}