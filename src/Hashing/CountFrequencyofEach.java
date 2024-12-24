
package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountFrequencyofEach {
    public static void main(String[] args) {
        int arr[] = {1,1,3,2,43,1,3,4,5,4,5,2,1,0,5,5,5};
        HashMap<Integer,Integer> countMap = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(countMap.containsKey(arr[i])){
                countMap.put(arr[i],countMap.get(arr[i])+1);
            }
            else{
                countMap.put(arr[i],1);
            }
        }

        countMap.entrySet().stream().forEach(System.out::println);

        System.out.println("Grouping By Streams");

        Map<Integer, Long> groupedByFrequency = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(
                e->e,
                Collectors.counting()
        ));

        groupedByFrequency.forEach((k,v)-> System.out.println(k+"-> " + v));



    }
}
