//递归求解汉诺塔问题
public class test10 {
    public static void main(String[] args) {
hanota(1,'A','B','C');
        System.out.println();
        hanota(2,'A','B','C');
        System.out.println();
        hanota(3,'A','B','C');
    }
    public static void move(char pos1,char pos3){
        System.out.print(pos1+"->"+pos3);
    }
    public static void hanota(int n,char pos1,char pos2,char pos3){
        if(n==1){
            move(pos1,pos3);
            return;
        }
        hanota(n-1,pos1,pos3,pos2);
        move(pos1, pos3);
        hanota(n-1,pos2,pos1,pos3);
    }
}
