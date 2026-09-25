static boolean findTarget(int arr[],int target)
{
    for (int i=0;i<arr.length;i++)
    {
        if(arr[i]==target)
        {
            return true;
        }
    }
    return false;
}
static void main()
{
    int arr[] = { 10,3,16,9,40,7};
            boolean ans = findTarget(arr, 40);
    System.out.println(ans);
}