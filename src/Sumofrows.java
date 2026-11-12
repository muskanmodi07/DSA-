import java.util.*;
public class Sumofrows {

    public List<Integer> sumofrows(int [][]arr){
        List<Integer> result = new ArrayList<>();
        int m = arr.length; //rows
        int n = arr[0].length; // column

        for(int rows =0; rows<m; rows++){
            int sum =0;
            for(int col = 0; col<n; col++){
                int value = arr[rows][col];
                sum = sum+ value;
            }
           result.add(sum);
        }
        return result;
    }
    public static void main(String args[]){
        int arr [][] = {{1,2,3},
                { 4,5,6},
                {7,8,9}};
        Sumofrows obj = new Sumofrows();
       List<Integer> ans = obj.sumofrows(arr);
        System.out.println(ans);
    }
}
