//public class Extrimistno {
//}

static void extrimistno(int arr[]){
    int n = arr.length;
    int i=0;
    int j = n-1;

    while(i<=j)
    {
        if(i==j)
        {
            System.out.print(arr[i]+" ");
        return;
        }
        else {
            System.out.print(arr[i]+" ");
            i++;
            System.out.print(arr[j]+" ");
            j--;
        }
    }
}
static void main()
{
    int arr[] = {1,2,3,4,5,6,7,8,1};
    extrimistno(arr);
}