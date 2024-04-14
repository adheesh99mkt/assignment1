public class CeilingOfNumber {
    public static void main(String[] args) {
        int []arr ={1,2,3,8,13,16,19};
        int target=15;
        int ans1=ceiling(arr,target);
        System.out.println("ceiling = "+arr[ans1]);
        int ans2=floor(arr,target);
        System.out.println("floor = "+arr[ans2]);
    }
    static int ceiling(int []arr, int target){
        int start=0;
        int end= arr.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
            else {
                return mid;
            }

        }return start;
    }
    static int floor(int []arr, int target){
        int start=0;
        int end= arr.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
            else {
                return mid;
            }

        }return end;
    }
}
