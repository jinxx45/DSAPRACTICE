package ArrayProblems;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static List<Integer> generateRow(Integer rowNum){
        List<Integer> row = new ArrayList<>();
        int ans = 1;
        row.add(1);

        for(int col=1;col<rowNum;col++){
            ans = ans* (rowNum-col);
            ans = ans/ col;
            row.add(ans);
        }

        return row;
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> result = new ArrayList<>();

        for(int i=1;i<=n;i++){
            result.add(generateRow(i));
        }

        result.forEach(System.out::println);
    }
}
