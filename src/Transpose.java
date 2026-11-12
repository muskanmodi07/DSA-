import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.List;

public class Transpose {
    public int [][] transpose(int [][]arr){

        int rows = arr.length;
        int cols = arr[0].length;
        //new
        int newrows = cols;
        int newcols = rows;
        int ans [][] = new int [newrows][newcols];

        for(int i= 0;i<rows;i++){
            for(int j =0;j<cols;j++){
                ans [j][i] = arr[i][j];
            }
        }
        return ans;
    }
    public static void main(){
        int arr[][] ={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        Transpose obj = new Transpose();
        //List<Integer> result = new ArrayList<>();
      int [][] result = obj.transpose(arr);

      for(int i=0;i<result.length;i++){
          for(int j =0;j<result[0].length;j++){
              System.out.print(result[i][j] +" ");
          }
          System.out.println();
      }

    }
}
