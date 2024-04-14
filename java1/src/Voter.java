import java.util.Scanner;

public class Voter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the age :");
        int age = in.nextInt();
        Voter(age);

    }
    static void Voter(int a){
        if(a>=18){
            System.out.println("eligible");
        }
        else{
            System.out.println("minor,not eligible");
        }
    }
}
