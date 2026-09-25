static int [] nozerosones(int arr[]) {
    int zerocount = 0;
    int onecount = 0;

    for(int i=0;i<arr.length;i++) {
        if (arr[i] == 0) {
            zerocount++;

        } else {
            onecount++;

        }
    }
    int ans[] = {zerocount,onecount};
    return ans;
}

static void main(){
    int arr[] = { 0,1,0,1,1,1,0};
    int ans[] = nozerosones(arr);
    System.out.println("zero count"+   ans[0]);
    System.out.println("zero count"+   ans[1]);


}