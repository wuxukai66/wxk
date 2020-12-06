public class simple10 {
    public static void main(String[] args){
        shuixianhua();
    }
    public static void shuixianhua(){
        int n;
        int a,b,c;
        for(n=0;n<1000;n++){
            a=n/100;
            b=n/10%10;
            c=n%10;
            if(a*a*a+b*b*b+c*c*c==n) {
                System.out.printf("%d ", n);
            }
        }
    }
}
