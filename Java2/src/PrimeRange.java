import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();
        Prime(n1,n2);

    }
    static void Prime(int start,int end){
        for(int i=start;i<=end;i++){
            int c=2;
            for(int j=2;j<i;j++){
                if(j<i){
                    if(i%j==0){
                        break;
                    }
                    else{
                        c++;
                    }
                }
            }
            if(c==i){
                System.out.println(i);
            }

        }
    }
}
