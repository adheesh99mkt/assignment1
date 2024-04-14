import java.util.Arrays;

public class Search2Darray {
    public static void main(String[] args) {
        int[][] array={{1,2,3,4},
                            {8,97},
                            {27,45,67,34}};
        int target=45;
        int[] ans=TwoDArray(array,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] TwoDArray(int[][] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if((arr[row][col])==target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
