public class SearchInRange {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10};
        int trgt=7;
        int ans=SearchinRange(array,trgt,3,9);
        System.out.println(ans);
    }
    static int SearchinRange(int[] arr, int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for (int index = start; index <=end ; index++) {
            if(target==arr[index]){
                return index;
            }
        }
        return -1;
    }
}
