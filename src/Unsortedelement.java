static int  unsortedele(int arr[]) {


    for(int i=0;i<arr.length;i++)
    {
            if(arr[i+1]<arr[i])
                return arr[i+1];
        }
    return -1;
    }

    static void main() {
    int arr[] = {1,6,9,7,15,21,100};
    System.out.println(unsortedele(arr));
}