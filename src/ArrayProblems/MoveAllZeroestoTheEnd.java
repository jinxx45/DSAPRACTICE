package ArrayProblems;

public class MoveAllZeroestoTheEnd {
    public static void main(String[] args) {
        int arr[] = {4,45,3,2,0,1,0,0,0,1,2,3};
        int l = 0;
        int r=0;
        int zeroCount=0;
        while(r<arr.length){
            if(arr[r]==0){
                r++;
                zeroCount +=1;
            }
            else{
                arr[l] = arr[r];
                l++;
                r++;
            }
        }

        for(int i = arr.length-zeroCount;i<arr.length;i++){
            arr[i]=0;
        }

        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }
}
