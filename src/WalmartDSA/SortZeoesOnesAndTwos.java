package WalmartDSA;

import java.util.Arrays;

public class SortZeoesOnesAndTwos {
    public static void main(String[] args) {
        int arr [] = {0,1,2,1,2,1,0,1,1,2,1,0,0,1};
        int n = arr.length;

        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid<=high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low+=1;
                mid+=1;
            }
            else if (arr[mid] == 2){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high-=1;
            }
            else if(arr[mid] ==1){
                mid +=1;
            }
        }

        Arrays.stream(arr).forEach(System.out::println);

    }
}
