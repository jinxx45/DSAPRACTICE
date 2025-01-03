package WalmartDSA;

public class BinarySearchInRotatedArray {
    public static void main(String[] args) {
        int arr[] = {4,5,6,1,2,3};
        int target = 3;

        int left = 0;
        int right = arr.length-1;
        int mid = 0;

        while(left<=right){
            mid = left + (right-left) / 2;

            if(arr[mid] == target) {System.out.println("Found AT index " + mid); return;}

            //left half sorted
            if(arr[left] <= arr[mid]){
                if(arr[left] <= target && target<= arr[mid]){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            else{
                if(arr[left] <= target && target<= arr[mid]){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }


        }
        System.out.println("Element not found");
    }
}
