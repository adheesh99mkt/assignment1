import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class NcrNpr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n:");
        int n = in.nextInt();
        System.out.print("r:");
        int r = in.nextInt();

        int Ncr=Fact(n)/(Fact(r)*Fact(n-r));
        int Npr=  Fact(n) /Fact(n-r);
        System.out.println("NCR = "+Ncr);
        System.out.println("NPR = "+Npr);

    }
    public static int Fact(int num){
        int res=1;
        int i=1;
        while (i<=num){
            res *= i;
            i++;
        }
        return res;

    }
}
