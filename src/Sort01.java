//import java.util.Array;
//public class Main {
    public static int[] sort01(int arr[]) {
        int n = arr.length;
        int i = 0, j = n - 1;
        while (i < j) {
            if (arr[i] == 1 && arr[j] == 1) {
                arr[i] = 0;
                arr[j] = 1;
            }
            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 1) {
                j--;
            }
        }
        return arr;
    }

    public static void main(String args[]) {
        int arr[] = {0, 1, 0, 0, 0, 1, 0};
        sort01(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
//}