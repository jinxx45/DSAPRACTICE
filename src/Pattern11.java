public class Pattern11 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0;i<=n;i++){
            int current = i%2;
            for(int j=0;j<i;j++){
                System.out.print(current + " ");
                if(current ==0 ){
                    current =1;
                }
                else current =0;
            }
            System.out.println("");
        }
    }
}
