import java.util.ArrayList;

public class BankWealth {
    public static void main(String[] args) {
        int[][] arr={
                {1,3,4,5,5},
                {3,2,4,5,10},
                {1,2,7,8},
                {10,20,30,40,59}
        };
        int ans=Wealth(arr);
        System.out.println(ans);
    }
    static int Wealth(int[][] arr){

        ArrayList<Integer> sum=new ArrayList<Integer>(3);
        for (int row = 0; row < arr.length ; row++) {
            int ans=0;
            for (int col = 0; col < arr[row].length; col++) {
                ans=ans+arr[row][col];
            }
            sum.add(row,ans);
        }
        int max= sum.get(0);
        for (int i = 1; i < sum.size(); i++) {
            if(sum.get(i)>max){
                max= sum.get(i);
            }
        }
        return max;
    }
}
