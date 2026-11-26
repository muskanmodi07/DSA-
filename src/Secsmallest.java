public class Secsmallest {
    public static void main(String args[]){
        int arr[] = {112,50,30,117,29,101,136,115,177,219,21};
        int min =arr[0];
        int secmin = Integer.MAX_VALUE;
       // int max = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min){
                secmin = min;
                min = arr[i];

            }
            /*if(arr[i]>max){
                max=arr[i];
            }*/

        }
        System.out.println(min);
        System.out.println(secmin);
       // System.out.println(max);
    }
}
