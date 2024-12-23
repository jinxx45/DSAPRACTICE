public class Pattern12 {
    public static void main(String[] args) {
        int n =5;
        for(int i=0;i<n;i++){
            int count =0;
            //first set
            for(int j=0;j<=i;j++){
                System.out.print(++count);
            }
            //spaces
            for(int j=0;j<(n*2) - (i*2) -2 ;j++){
                System.out.print(" ");
            }
            //second set
            for(int j =n-i-1;j<n;j++){
                System.out.print(count--);
            }
            System.out.println("");
        }

    }

}
