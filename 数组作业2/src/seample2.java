
public class seample2 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7};
        System.out.println(erfen(arr,5));
    }
    public static int erfen(int[]arr, int key){
        int left=0;
        int right=arr.length-1;
        while(left<=right) {
            int mid = (left + right) / 2;
            if (arr[mid] > key){
                right = mid - 1;
            }
             else if (arr[mid] < key) {
                left = mid + 1;
            } else{
                 return mid;
            }
        }
        return -1;

    }
}
