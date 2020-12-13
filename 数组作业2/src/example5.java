
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
