//创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
import java.util.Arrays;
public class text5 {
    public static void main(String[] args){
        System.out.println(Arrays.toString(creat()));
    }
    public static int[] creat(){
        int[]array2=new int[100];
        int len=array2.length;
        for(int i=0;i<len;i++){
           array2[i]=i+1;
        }return array2;
    }
}
