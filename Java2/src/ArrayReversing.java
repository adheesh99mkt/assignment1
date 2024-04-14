import java.util.Arrays;

public class ArrayReversing {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }
    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    static void reverse(int[] arr){
        int start=0;
        int end= arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;end--;
        }


    }
}