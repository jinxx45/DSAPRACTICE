package Hashing;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcedfghijk";
        HashSet<Character> currentSet = new HashSet<>();
        int longestLength = 0;
        int currentLength =0;
        for(int i =0; i<s.length();i++){
            if(currentSet.add(s.charAt(i))){
                currentLength++;
            }else{
                currentSet.removeAll(currentSet);
                if(currentLength>longestLength) longestLength = currentLength;
                currentLength =0;
                i--;
            }
        }
        System.out.println((currentLength> longestLength)? currentLength:longestLength);
    }
}
