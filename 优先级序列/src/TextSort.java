import java.util.Arrays;

/**
 * 时间复杂度：
 * 最坏情况下，数据都无序o(n^2)
 * 最好情况下，当数据都有序可以达到o(n)
 * 空间复杂度：
 *
 */
public class TextSort {
    public static void insertSort(int[] array) {
        for(int i=1;i<array.length;i++){
            int tmp=array[i];
            int j=i-1;
            for(;j>=0;j--){
                if(array[j]>tmp){
                    //如果这里是一个大于等于号就不稳定了
                    array[j+1]=array[j];
                }else{
                    break;
                }
            }
            array[j+1]=tmp;
        }
    }
    public static void main(String[] args) {
        int[] array = {10,3,2,7,19,78,65,127};
        System.out.println(Arrays.toString(array));
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
