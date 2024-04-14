import java.util.Arrays;

public class MountainarraySearch {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 6, 8, 10, 9, 7, 5, 2};
        int target = 9;
        int ans = search(array, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target) {
        int peak = peakIndex(arr);
        int first = orderAgnosticBsearch(arr, target, 0, peak);
        if (first != -1) {
            return first;
        } else {
            return orderAgnosticBsearch(arr, target, peak + 1, arr.length - 1);
        }
    }

    static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int orderAgnosticBsearch(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

}
