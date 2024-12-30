package ArrayProblems;

public class MatrixRowColZeros {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9}
        };

        boolean rowZero[] = new boolean[matrix.length];
        boolean colZero[] = new boolean[matrix[0].length];

        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }

        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(rowZero[i] || colZero[j]){
                    matrix[i][j] =0;
                }
            }
        }

        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }



    }
}
