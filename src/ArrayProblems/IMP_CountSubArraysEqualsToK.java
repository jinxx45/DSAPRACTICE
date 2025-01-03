package ArrayProblems;

import java.util.HashMap;

public class IMP_CountSubArraysEqualsToK {
    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 4};
        int k = 6;
        int count =0;
        int presum=0;
        HashMap<Integer,Integer> presumMap = new HashMap<>();
        presumMap.put(presum,1);

        for(int i=0;i<arr.length;i++){
            presum+=  arr[i];
            count += presumMap.getOrDefault(presum - k, 0);
            presumMap.put(presum, presumMap.getOrDefault(presum, 0) + 1);
        }
        System.out.println(count);
    }
}
