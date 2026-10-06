static void removeduplicate(int arr[])
{
    int n = arr.length;
    int i,j;
    while(i<j) {
        for ( i = 0; i < n - 1; i++) {
            for ( j = n - 1; j > 0; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = arr[j(arr[n - 1])];
                }
            }
        }
        System.out.println("Duplicate element not exist");
    }
}
static void main(){
    int arr[]= {1,3,2,6,1,5,7};
    removeduplicate(arr);
}