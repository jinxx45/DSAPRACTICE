public class Pattern6 {
    public static void main(String[] args) {
        int n=5;

        for(int i=0;i<n;i++){
            int count =1;
            for(int j=0;j<n-i;j++){
                System.out.print(count++);
            }
            System.out.println("");
        }
    }

}
