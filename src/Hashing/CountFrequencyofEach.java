
package Hashing;

import java.util.*;
import java.util.stream.Collectors;

public class CountFrequencyofEach {
    public static void main(String[] args) {
        int arr[] = {1,1,3,2,43,1,3,4,5,4,5,2,1,0,5,5,5};
        HashMap<Integer,Integer> countMap = new HashMap<>();

        for(int num:arr){
            if(countMap.containsKey(num)){
                countMap.put(num,countMap.get(num)+1);
            }else {
                countMap.put(num, 1);
            }
        }

        TreeMap<Integer, List<Integer>> countMap2 = new TreeMap<>(Comparator.reverseOrder());
        countMap.forEach((k,v)->{
            if(countMap2.containsKey(v)){
                List<Integer> existingList = countMap2.get(v);
                existingList.add(k);
                countMap2.put(v,existingList);
            }else{
                List<Integer> l = new ArrayList<>();
                l.add(k);
                countMap2.put(v,l);
            }
        });

        countMap2.forEach((k,v)->{
            for(int num:v){
                for(int i=0;i<k;i++){
                    System.out.print(num +" ");
                }
            }
        });











    }
}
