public class simple9 {
//    分数和
    public static void main(String[] args) {
        fenshuhe();
    }
    public static void fenshuhe(){
        double i=1.0;
        double n=1.0;
        double sum=0;
        for(n=1;n<101;++n){
            sum+=i/n;
            i=-i;
        }
        System.out.println(sum);
    }
}