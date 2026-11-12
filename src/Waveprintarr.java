import java.util.ArrayList;
import java.util.List;
public class Waveprintarr {
    public List<Integer> waveprintarr(int [][]arr) {
        List<Integer> result = new ArrayList<>();
        int m = arr.length; //row
        int n = arr[0].length; //col

        for (int col = 0; col < n; col++) {
            if ((col & 1) == 1) {
                //odd
                for (int row = m - 1; row >= 0; row--) {
                    result.add(arr[row][col]);
                }
            } else {
                //even
                for (int row = 0; row < m; row++) {
                    result.add(arr[row][col]);
                }
            }
        }
        return result;
    }
    public  static void main(){
        int arr[][] = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        Waveprintarr obj = new Waveprintarr();
       List<Integer> ans = obj.waveprintarr(arr);
        System.out.println(ans);
    }
}
