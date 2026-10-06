//public class Lastocc {
//}

static void lastocc(int arr[],int num) {
    int n = arr.length;

    for (int i = n - 1; i >= 0; i--) {
        if (arr[i] == num) {
            System.out.println("Last occurrence of a number at index " + i);
            return;
        }
        }
    System.out.println("number is not found");
}

static void main() {
    int arr[] = {10,51,75,50,67,20,36,95,87,72,34,50,95,63,85,28,20};
    int num = 20;
   lastocc(arr,num);
}
