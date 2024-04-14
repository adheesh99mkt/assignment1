import java.util.Scanner;

public class MaxMin3numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        Max(a,b,c);
        Min(a,b,c);

    }
    static void Max(int a,int b,int c){
        int max=Math.max(Math.max(a,b),c);
        System.out.println(max+" is the maximum");
    }
    static void Min(int a,int b,int c){
        int min=Math.min(Math.min(a,b),c);
        System.out.println(min+" is the miniimum");
    }

}
