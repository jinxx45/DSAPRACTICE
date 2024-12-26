package ArrayProblems;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int a[] = {2,7,11,15};
        int target = 9;

        HashMap<Integer,Integer>  seen = new HashMap<>();
        for(int i=0;i<a.length;i++){
            int complement = target - a[i];
            if(seen.containsKey(complement)){
                System.out.print("["+seen.get(complement)+","+ i +"]");
            }
            seen.put(a[i],i);
        }

     }
}
