package ArrayProblems;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int arr[] = {1, 1, 0, 1, 1, 1,0,1,1,1,1,1,1};
        int count = 0;
        int maxCount = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=1){
                count = 0;
            }
            else{
                count++;
                maxCount = Math.max(count,maxCount);
            }
        }

        System.out.print(maxCount);


    }
}
