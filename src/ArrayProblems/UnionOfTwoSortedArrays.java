package ArrayProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int arr[] = {1,2,5,7,8,9,10};
        int arr2[] = {3,4,5,11,12,1,2,3};

        HashSet<Integer> result = new HashSet<Integer>();
        int l =0;
        int r=0;

        while(l<arr.length ){
            if(arr[l]<arr2[r]){
                result.add(arr[l]);
                l++;
            }
            else if(arr[l]> arr2[r]){
                result.add(arr2[r]);
                r++;
            }
            else{
                result.add(arr[l]);
                l++;
                r++;
            }
        }

        while(r<arr2.length){
            result.add(arr2[r++]);
        }



        result.forEach(System.out::println);


    }
}
