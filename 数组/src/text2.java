public class text2 {
    public static void main(String[] args){
        int []array2={1,2,3,4,5};
        System.out.println(sum(array2));
    }
    public static int sum(int[]array){
        int len=array.length;
        int sum=0;
        for(int i=0;i<len;i++){
            sum+=array[i];
        }
        return sum;
    }
}
