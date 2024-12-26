package ArrayProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,5,7,8,9,10,2};
        int arr2[] = {3,4,2,5,11,12,11,2,3,4,6,8,2,2,2};

        List<Integer> intersection = new ArrayList<Integer>();


        HashMap<Integer,Integer> countMap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!countMap.containsKey(arr[i])){
                countMap.put(arr[i],1);
            }
            countMap.put(arr[i],countMap.get(arr[i])+1);
        }

        for(int i=0;i<arr2.length;i++){
            if(countMap.containsKey(arr2[i])){
                intersection.add(arr2[i]);
                countMap.put(arr2[i],countMap.get(arr2[i])-1);
                if(countMap.get(arr2[i])==0){
                    countMap.remove(arr2[i]);
                }
            }
        }

        intersection.forEach(System.out::println);


    }
}
