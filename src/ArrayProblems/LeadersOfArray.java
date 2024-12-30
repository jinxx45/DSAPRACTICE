package ArrayProblems;

import java.util.ArrayList;
import java.util.List;

public class LeadersOfArray {
    public static void main(String[] args) {
        int  arr[] = {4, 7, 1, 0};
        int max = arr[arr.length-1];
        List<Integer> result = new ArrayList<>();
        result.add(arr[arr.length-1]);

        for(int i= arr.length-1;i>=0;i--){
            if(max< arr[i]){
                max = arr[i];
                result.add(arr[i]);
            }
        }

        result.forEach(System.out::println);

    }
}
