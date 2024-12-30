package ArrayProblems;

public class IMP_MaxSubArray {
    public static void main(String[] args) {
        int a[] = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSum = a[0];
        int sum =0;
        int start=0;
        int end =0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(sum>maxSum){
                end = i;
                maxSum = sum;
            };

            if(sum<0) {sum=0; start =i+1;}
        }
        System.out.println(maxSum);
        System.out.println("Start - " + a[start]);
        System.out.println("End - " + a[end]);
    }
}
