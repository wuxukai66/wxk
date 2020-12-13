import java.util.Arrays;
public class seample3 {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(Arrays.toString(arr));
    }
    public static int[] copyOf(int []arr){
        int ret[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ret[i]=arr[i];
        }
        return ret;
    }
}
