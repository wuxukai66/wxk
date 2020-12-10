//实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
public class text1 {
    public static void main(String[] args){
        int[]array2={1,2,3,4,5,};
        System.out.println(avg(array2));
    }
    public static double avg(int[]array){
        int len=array.length;
        int sum=0;
        double avg=0;
        for(int i=0;i<len;i++){
           sum+=array[i];
        }
        avg= (double)sum/(double)len;
        return avg;
    }
}
