import java.util.Arrays;
public class seample4 {
    public static void main(String[] args) {
      int[]arr={1,5,3,4,6,0};
     maopao(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void maopao(int[]arr){
        boolean flg=false;
        for(int i=0;i<=arr.length-1;i++){
            flg=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                    flg=true;
                }
            }
            if(flg==false){
                return;
            }
        }

    }
}
