//public class Threesum {
    static void threesum(int [] arr,int target){
    int n = arr.length;
        for(int i=0;i<=n-2;i++){
            for(int j=i+1;j<=n-1;j++){
                for(int k=j+1;k<n;k++){

                    if(arr[i]+arr[j]+arr[k]==target){
                        System.out.println("Three sum found at "+ i+" "+j+" "+k);
                        return;
                    }
                }
            }
        }
        System.out.println("Three sum not exist");
    }

    static void main(){
    int arr[]= {1,4,8,7,-6,9,2,5};
    int target = 0;
    threesum(arr,target);
    }
