package ArrayProblems;

import java.util.Arrays;

public class RemoveDuplicateInSortedArray {
    public static void main(String[] args) {
        int dupArr [] = {1,2,3,4,5,5,6,6,7};

        int l=0;
        int r=l+1;

        for(r = l+1;r<dupArr.length;r++){
            if(dupArr[l]!= dupArr[r]){
                l++;
                dupArr[l] = dupArr[r];
            }
        }
        int[] uniqueArr = Arrays.copyOfRange(dupArr, 0, l + 1);



        Arrays.stream(uniqueArr).forEach(System.out::println);

    }
}
