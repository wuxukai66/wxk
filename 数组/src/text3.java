//实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
//改变原来数组的值
import java.util.Arrays;
public class text3 {
    public static void main(String[] args) {
        int[]array={1,2,3};
        transform(array);
        System.out.println(Arrays.toString(array));
    }
    public static int[] transform(int[] array2){
        for(int i=0;i<array2.length;i++){
            array2[i]=array2[i]*2;
        }
        return array2;
    }
}
