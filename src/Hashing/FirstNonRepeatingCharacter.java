package Hashing;
import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String s = "leetcode";
        LinkedHashMap<Character,Integer> charCount = new LinkedHashMap<>();
        for(Character c: s.toCharArray()){
            if(charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            }else{
                charCount.put(c,1);
            }
        }

        for(Map.Entry<Character,Integer> entry : charCount.entrySet()){
            if(entry.getValue() ==1){
                System.out.println(entry.getKey());
                break;
            }
        }
    }




}
