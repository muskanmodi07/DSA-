public class Spiralprint {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int m = matrix.length; // row
        int n = matrix[0].length; //col

        int sr = 0;
        int er = m - 1;
        int sc = 0;
        int ec = n - 1;

        while (sr <= er && sc <= ec) {
            for (int i = sc; i <= ec; i++) {
                System.out.println(matrix[sr][i]);
            }
            sr++;

            for (int i = sr; i <= er; i++) {
                System.out.println(matrix[i][ec]);
            }
            ec--;

            if (sr <= er) {
                for (int i = ec; i >= sc; i--){
                    System.out.println(matrix[er][i]);
                }
                er--;

                if(sc<=ec){
                    for(int i=er;i>=sr;i--){
                        System.out.println(matrix[i][sc]);
                    }
                    sc++;
                }
            }
        }
    }
}