public class simple2 {
public static void main(String[] args){
LeapYear();
}
public static void LeapYear(){
    int i=0;
    for(i=1000;i<2001;i++){
        if(i%4==0&&i%100!=0||i%400==0){
            System.out.printf("%d ",i);
        }
    }
}
}
