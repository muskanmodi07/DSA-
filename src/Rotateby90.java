public class Rotateby90 {
    public static void main(String args[]){
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int n = matrix.length;
        //transpose
        for(int i=0;i<n;i++){ //row
            for(int j=i+1;j<n;j++){ //col
                int temp  = matrix[i][j];
                matrix[i][j] = matrix [j][i];
                matrix [j][i] = temp;
            }
        }
        //reverse row
        for(int i =0 ; i<n;i++){
            int left = 0;
            int right =n-1;
            int temp = matrix[i][left];
            matrix[i][left] = matrix[i][right];
            matrix [i][right] = temp;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("matrix[i][j] = "+ matrix[i][j]);
            }
            System.out.println();
        }
    }
}
