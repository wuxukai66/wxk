//实现一个方法 toString, 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} , 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
public class example5 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(myToString(arr));
    }
    public static String myToString(int[]arr){
        String ret="[";
        for (int i = 0; i <arr.length ; i++) {
            ret=ret+arr[i];
            if(i!=arr.length-1){
                ret+=", ";
            }
        }
        ret+="]";
        return ret;
    }
}
