//public class countele {
//}
//3. Count how many times X occurs

static void countele(int arr[],int num) {
    int count=0;
    for(int i = 0; i< arr.length; i++)
    {
        if(arr[i]==num)
        {
            //System.out.println("number found at "+i);
             count++;
        }
    }
    System.out.println(count);
    return;
}

static void main()
{
    int arr [] = {10,15,30,11,65,75,15,71,85,15};
    int num = 15;
    countele(arr,num);
}






