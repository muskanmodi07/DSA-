public class Promaxsubarray {

    public static int promaxsubarray(int arr[]) {
        int pro = 1;
        int maxpro = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            pro = pro * arr[i];

            if (pro > maxpro) {
                maxpro = Math.max(pro, maxpro);
            }

            if (pro < 0) {
                pro = 1;
            }

        }
        return pro;
    }
        public static void main(){
            int arr [] = { 1, -2 , 3 ,-4,5};
            System.out.println(promaxsubarray(arr));
        }
    }

