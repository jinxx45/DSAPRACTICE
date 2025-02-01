package WalmartDSA;

import java.util.Arrays;

public class ReverseKGroup {

    public static void main(String[] args) {
        // Input array and k
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 5;

        // Reverse groups of k
        reverseInGroups(arr, k);

        // Print the output
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseInGroups(int[] arr, int k) {
        int n = arr.length;
        for(int i =0;i< n; i+=k){
            int start = i;
            int end = Math.min(i+k-1,n-1);

            while(start<= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }


    }
}
