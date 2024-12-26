package ArrayProblems;

public class IMP_LengthOfLongestSubArray {
    public static void main(String[] args) {
        int a[] = {2,3,5,1,9};
        int k = 10;
        int sum=0;
        int left = 0;
        int right = 0;
        int maxLen = 0;
        while(right<a.length){
            sum+= a[right];
            right++;

            if(sum == k){
                maxLen = Math.max(maxLen, right-left);
            }

            while(sum>k && left<=right){  //Shrinking Condition
                sum-= a[left];
                left++;
            }
        }
        System.out.print(maxLen);

    }
}
