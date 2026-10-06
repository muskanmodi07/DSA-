static void twosum(int arr[] , int target){

    for(int i=0;i<arr.length;i++){
        for(int j = i+1;j<arr.length;j++){
            int temp =0;
            temp = arr[i]+arr[j];
            if(temp==target){
                System.out.println("Two Sum exist "+i+ " " + j);
                return;
            }

        }
    }
    System.out.println("Two Sum do not exist");
}
 static void main(){
    int arr[] = { 1,7,6,9,2,4,0,14};
    int target = 6;
    twosum(arr,target);
 }