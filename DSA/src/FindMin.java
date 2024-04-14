public class FindMin {
    public static void main(String[] args) {
        int[] array={2,3,4,5,6,7,8,0,1,-1};
        int ans=Minimum(array);
        System.out.println(ans);
    }
    static int Minimum(int[] arr){
        int min=arr[0];
        for (int index = 1; index < arr.length ; index++) {

            if(arr[index]<min){
                min=arr[index];
            }
        }
        return min;
    }
}
