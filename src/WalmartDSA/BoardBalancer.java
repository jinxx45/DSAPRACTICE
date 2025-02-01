
package WalmartDSA;
import java.util.*;


public class BoardBalancer {

    public static int solution(StringBuilder row1, StringBuilder row2) {
        int n = row1.length();
        int ans = 0;
        HashMap<Character,Integer> mp1 = new HashMap<>();
        HashMap<Character,Integer> mp2 = new HashMap<>();

        //Adjusting col wise
        for(int i =0;i<n;i++){
            if(row1.charAt(i) == 'W' && row2.charAt(i) == 'W') return -1;
            if(row1.charAt(i) == 'R' && row2.charAt(i) == 'R') return -1;

            if(row1.charAt(i)== 'R' && row2.charAt(i) == '?'){
                row2.setCharAt(i,'W');
                ans+=1;
            }

            if(row1.charAt(i)== 'W' && row2.charAt(i) == '?'){
                row2.setCharAt(i,'R');
                ans+=1;
            }

            if(row2.charAt(i)== 'W' && row1.charAt(i) == '?'){
                row1.setCharAt(i,'R');
                ans+=1;
            }

            if(row2.charAt(i)== 'R' && row1.charAt(i) == '?'){
                row1.setCharAt(i,'W');
                ans+=1;
            }

            mp1.put(row1.charAt(i), mp1.getOrDefault(row1.charAt(i),0)+1);
            mp2.put(row2.charAt(i), mp2.getOrDefault(row2.charAt(i),0)+1);
        }
        int diffInMp1 = Math.abs(mp1.getOrDefault('W',0) - mp1.getOrDefault('R',0));
        int diffInMp2 = Math.abs(mp2.getOrDefault('W',0) - mp2.getOrDefault('R',0));
        int numberofQ = mp1.getOrDefault('?',0);
        int numberOfQ2 = mp2.getOrDefault('?',0);

        if(diffInMp1 == diffInMp2 && diffInMp1<= numberOfQ2){
            ans+= 2* diffInMp1;
            return ans;
        }
        return -1;

    }

    public static void main(String[] args) {
        // Sample input
        String row1 = "WR???R?";
        String row2 = "RW?R???";

        // Output the result
        System.out.println(solution(new StringBuilder(row1), new StringBuilder(row2)));
    }
}
