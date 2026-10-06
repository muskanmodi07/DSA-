
/*static void deleteElement(int[] arr, int index) {


    for (int i = index; i < arr.length - 1; i++) {
        arr[i] = arr[i + 1];
    }


    for (int i = 0; i < arr.length - 1; i++) {
        System.out.print(arr[i] + " ");
    }
}

static void main(String[] args) {

    int[] arr = {10, 20, 30, 40, 50};
    int index = 3;

    deleteElement(arr, index);
}

/*
import java.util.Scanner;
class DeleteElement {

    static void deleteElement(int[] arr, int index) {

        // Shift elements to the left
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Print array after deletion
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter index to delete: ");
        int index = sc.nextInt();

        deleteElement(arr, index);

        sc.close();
    }
}




    static void deleteElement(int[] arr, int num) {

        int index = -1;

        // Search for first occurrence
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
                break;
            }
        }


        if (index == -1) {
            System.out.println("Element not found");
            return;
        }


        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Print array after deletion
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40};
        int num = 20;

        deleteElement(arr, num);
    }

    static void deleteAll(int[] arr, int num) {

        int newSize = 0;

        // Keep only elements that are not equal to num
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                arr[newSize] = arr[i];
                newSize++;
            }
        }

        // Print the new array
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 20};
        int num = 20;

        deleteAll(arr, num);
    }


static void rotatearr1(int arr[])
{
    int temp = arr[0];
int n = arr.length;
    for(int i=0;i<n-1;i++)
    {
        arr[i]=arr[i+1];
    }
  // n-1 = temp;
}

static void main(){
    int arr[] = {10,20,30,40,50};
    rotatearr1(arr);
}
    static void leftRotate(int[] arr) {

        int first = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = first;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        leftRotate(arr);
    }
    static void rightRotate(int[] arr) {

        int last = arr[arr.length - 1];

        // Shift elements to the right
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Put last element at the first
        arr[0] = last;

        // Print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        rightRotate(arr);
    }
    static void leftRotate(int[] arr, int k) {

        k = k % arr.length;

        for (int j = 0; j < k; j++) {

            int first = arr[0];

            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

             arr[arr.length - 1] = first;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int k = 2;

        leftRotate(arr, k);
    }
    static void rightRotate(int[] arr, int k) {

        k = k % arr.length;

        for (int j = 0; j < k; j++) {

            int last = arr[arr.length - 1];

            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }

            arr[0] = last;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int k = 2;

        rightRotate(arr, k);
    }
*/

static void removenegno(int arr[]){

    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]>0)
        {
            System.out.print(" "+arr[i]);
        }
    }
}
static void main(String args[]){
    int arr[]={10,-54,85,-17,65,36,-77,36,85,-5};
    removenegno(arr);
}