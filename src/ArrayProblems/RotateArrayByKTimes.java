package ArrayProblems;

import java.util.Arrays;

public class RotateArrayByKTimes {

    public static void reverseArray(int arr[], int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8};
        int k = 3;
        reverseArray(arr,0,k%arr.length-1);
        reverseArray(arr,k% arr.length,arr.length-1);
        reverseArray(arr,0,arr.length-1);

        Arrays.stream(arr).forEach(System.out::print);



    }
}
