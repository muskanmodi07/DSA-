public class Subarraymax {
    public static int subarraymax(int arr []){

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

            sum = sum + arr[i];

            if(sum>max){
                max = Math.max(sum,max);
            }

            if(sum<0){
                sum =0;
            }
           }
        return max;
    }

    public static void main(){
        int arr[]={1,-8,7,6,5,1,-8,2};
        //subarraymax(arr);
        System.out.println(subarraymax(arr));
    }
}
