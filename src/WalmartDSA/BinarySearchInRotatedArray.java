package WalmartDSA;

public class  BinarySearchInRotatedArray {
    public static void main(String[] args) {
        int arr[] = {4,5,6,1,2,3};
        int target = 4;

        int n = arr.length;

        int low = 0;
        int high = n-1;

        while(low<=high){
            int mid = low+ (high-low) /2;

            if(arr[mid] == target) {System.out.println("Found at " + mid); return;};

            //left part is sorted
            if(arr[mid]>=arr[low]){
                if(arr[low]<= target && target<arr[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }

            //right part is sorted
            else{
                if(arr[mid] <= target && target <= arr[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }

        }

        System.out.println("Not found !!");

    }
}
