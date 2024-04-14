public class EvenNumberDigits {
    public static void main(String[] args) {
        int[] array={1,23,24,345,4567,4563,98,2,3,4,56,4,356,34,35,3456};
        int ans=EvenDigit(array);
        System.out.println(ans);
    }
    static int EvenDigit(int[] arr){
        int count=0;
        for (int i : arr) {
            String S = String.valueOf(i);
            if (S.length() % 2 == 0) {
                count++;
            }
        }
        return count;

    }
}
