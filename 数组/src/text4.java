//实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
public class text4 {
    public static void main(String[] args){
        int array2[]={1,2,3};
        PrintArray(array2);
    }
    public static int[] PrintArray(int[]array){
       int len=array.length;
        for(int i=0;i<len;i++){
            System.out.print(array[i]+" ");
        }return array;
    }
}