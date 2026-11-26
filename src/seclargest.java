public class seclargest {
    public static void main(String[] args){
        int arr[] ={125,475,987,365,254,985,362,124};
        int max =arr[0];
        int secmax = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secmax = max;
                max = arr[i];
            }
            else if(arr[i]<max && arr[i]>secmax){
                secmax = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(secmax);
    }
}
