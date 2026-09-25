//public class Maxele {
//}

static void minele(int[] arr)
{
    int min = arr[0];
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]<min)
        {
            min = arr[i];
        }
    }
    System.out.println("Maximum element in an array is "+ min);
}
static void main()
{
    int arr[] = {10,54,31,(-12),69,91,0,86};
    minele(arr);
}
