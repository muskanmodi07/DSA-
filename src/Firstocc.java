public class Firstocc {
    static void firstocc(int arr[]){
        int n = arr.length;
        int temp=0;
        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
               temp= arr[i];
            }
            }
        }
        System.out.println("First repeating element in an array is "+ temp);
    }
    static void main(){
        int arr[] = {5,3,9,7,2,6,3,10};
        firstocc(arr);
    }
}
