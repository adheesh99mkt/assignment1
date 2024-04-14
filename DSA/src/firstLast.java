import com.sun.source.tree.BreakTree;

import java.util.Arrays;

//find the first and last position of elemnts in a sorted array
public class firstLast {
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,9,10};
        int target=7;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[] arr,int target){
       int [] ans={-1,-1};
       int start=FL(arr,target,true);
       int end=FL(arr,target,false);
       ans[0]=start;
       ans[1]=end;
       return ans;

    }
    static  int FL(int[] arr,int target,boolean gate){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
            else {
                ans=mid;
                if(gate){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
        }return ans;
    }

}
