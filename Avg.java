class Avg
{
public static void main(String args[])
{
int a[] = {7,15,3,6,2};
int sum=0;
for(int i=0;i<a.length;i++)
{
sum = sum + a[i];
}
int avg = (sum)/(a.length);
System.out.println("Average of an array is "+ avg); 
}
}