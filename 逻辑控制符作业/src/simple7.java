public class simple7 {
    public static void main(String[] args){
        yueshu(4,4);
    }
    public static void yueshu(int a,int b){
        if(a>b&&a%b==0){
            System.out.printf("最大公约数为%d",b);
        }
        else if(a<b&&b%a==0){
            System.out.printf("最大公约数为%d",a);
        }else{
            System.out.println("最大公约数为1");
        }
    }
}
