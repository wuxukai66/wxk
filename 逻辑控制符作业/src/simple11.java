public class simple11 {
    public static void main(String[] args){
dayin(123);
    }
    public static void dayin(int n){
       if(n!=0){
           dayin(n/10);
           System.out.println(n%10);
       }
    }
}
