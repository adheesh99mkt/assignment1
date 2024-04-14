import java.util.Objects;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("trianle=1\ncircle=2\nrectangle=3");
        System.out.print("enter the choice:");
        int n= inp.nextInt();
        if (n==1){
            System.out.print("enter height and base:");
            int b=inp.nextInt();
            int l=inp.nextInt();
            int area=(b*l)/2;
            System.out.println("area of triangle= "+area);
        } else if (n==2) {

            System.out.print("enter the radius:");
            int r = inp.nextInt();
            double area=3.14*(r*r);
            System.out.println("area of circle= "+area);

        } else if (n==3) {
            System.out.print("enter the breadth and length");
            int b=inp.nextInt();
            int l=inp.nextInt();
            int area=l*b;
            System.out.println("area of rectangle= "+area);


        }
        else{
            System.out.println("please from the given choice!");
        }
    }
}
