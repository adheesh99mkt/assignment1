public class LinearSerach {
    public static void main(String[] args) {
        int[] array={35,23,23,43,23,55,65,65,43,11};
        int element=43;
        int ans=linearSearch(array,element);

        System.out.println(ans);
    }
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }
    static int linearSearch2(int[] arr,int target){
        for (int element : arr) {
            if (element== target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
    static boolean linearSearch3(int[] arr,int target){
        for (int element : arr) {
            if (element== target) {
                return true;
            }
        }
        return false;
    }
}
