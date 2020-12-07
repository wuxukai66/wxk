//    有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
public class text1 {
    public static void main(String[] args){
        chazhao();
    }
    public static void chazhao(){
        int []arr={1,1,2,2,3,4,4,5,5};
        int i=0;int sum=0;
        for(i=0;i<arr.length;i++){
            sum=sum^arr[i];
        } System.out.println(sum);
    }
}
