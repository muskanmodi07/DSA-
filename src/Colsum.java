import java.util.ArrayList;
import java.util.List;

public class Colsum {
    public List<Integer> colsum(int [][]arr){
        List<Integer> result = new ArrayList<>();

        int m = arr.length; // row
        int n = arr[0].length; // col
        //int sum=0;
        for(int col =0;col<n;col++){
            int sum=0;
            for(int row =0;row<m;row++){
                int value = arr[row][col];
                sum = sum+ value;
            }
            result.add(sum);
        }
        return result;
    }
    public static void main(){
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        Colsum obj = new Colsum();
        List<Integer> ans = obj.colsum(arr);
        System.out.println(ans);
    }
}
