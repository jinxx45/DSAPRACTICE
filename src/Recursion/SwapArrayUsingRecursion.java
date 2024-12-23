package Recursion;

import java.util.Arrays;

public class SwapArrayUsingRecursion {
    static int[] arr = {1,2,3,4,5};
    static void arrayReverse(int left, int right){
        if(left>right){
            return;
        }
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
        arrayReverse(left+1,right-1);

    }

    public static void main(String[] args) {

        arrayReverse(0,arr.length-1);
        Arrays.stream(arr).forEach(System.out::println);

    }
}
