public class example1 {
    public static void main(String[] args) {
int []arr={1,2,3,4,5};
        System.out.println(panduan(arr));
    }
    public static boolean panduan(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }

        }return true;

    }
}
