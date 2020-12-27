//给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面.
import java.util.Arrays;
public class Text {
    public static void main(String[] args) {
    int[]arr1={1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(Sequence(arr1)));
    }
    public static int[] Sequence(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>i;j--){
                if(arr[i]%2!=0&&arr[j]%2==0){
                    int tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
            }
            }
        }
        return arr;
    }
}
