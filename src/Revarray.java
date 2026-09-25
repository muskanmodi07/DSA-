//public class ArrayyManipulation {


    static void revArray(int arr[]) {
        int i = 0;
        int n = arr.length;
        int j = n - 1;
       // int n = arr.length;

        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
            for (int k : arr)
                System.out.println(k);
        }

    static void main()
    {
        int arr[] ={ 1,2,3,4,5};
        revArray(arr);

    }
