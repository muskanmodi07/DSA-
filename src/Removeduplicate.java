static int removeduplicate(int arr[]){
    int n= arr.length;
    int i=0,j=1;

    while(j<n){

        if(arr[i]==arr[j]){
            j++;
        }
        else{
            //(arr[i]!=arr[j])
            i++;
            arr[i]=arr[j];
            j++;
        }
    }
return i+1;

}
static void main(){
    int arr[]={1,2,2,2,2,3,3,4};
    int ans  = removeduplicate(arr);
    System.out.println("New length of an array is "+ans);
}