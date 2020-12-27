//给定两个整型数组, 交换两个数组的内容.
import java.util.Arrays;
public class Text2 {
    public static void main(String[] args) {
        int[]arr1={1,2,3,4,5};
        int[]arr2={6,7,8,9,10};
        swap(arr1,arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    public static void swap(int[]arr1,int[]arr2){
        for (int i = 0; i <arr1.length ; i++) {
                int tmp=arr1[i];
                arr1[i]=arr2[i];
                arr2[i]=tmp;
        }
    }
}
