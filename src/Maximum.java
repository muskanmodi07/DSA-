static int findmax(int arr[]){
    int max = arr[0];
    for(int i=0;i<arr.length;i++)
    {
           if(max<arr[i])

                max= arr[i];
               }
    return max;
    }
 static void main() {
    int arr[] = {7,3,2,91,10};
    System.out.println(findmax(arr));   //"Maximum element found in array is"+ max + " at "+ i + " index"));
}
