public class Copyelefromarr {

    static int [] copyelefromarr(int[] arr){
        int copyArray[] = new int[arr.length];

        for(int i =0;i<arr.length;i++){
            copyArray[i] = arr[i];
             }
        return copyArray;
        }
    public static void main(){
        int arr[] = {1,2,3,4,5};
        int ans[] = copyelefromarr(arr);
        for(int i:ans)
            System.out.println("Copied Array "+i);
    }
}
