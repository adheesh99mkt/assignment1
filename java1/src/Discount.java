import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the price of product : ");
        int price = in.nextInt();
        System.out.print("enter the percentage of discount : ");
        float disc = in.nextFloat();
        float priceAfter=price-(price*disc/100);
        System.out.println("price after discount = "+priceAfter);
    }
}
