public class simple3 {
    public static void main(String[] args) {
        sushu();
    }
//1-100之间的素数
    public static void sushu() {
        int i = 0;
        int j = 0;
        for (i = 1; i < 101; i++) {
            int flag = 0;
            for (j = 2; j <= Math.sqrt((double)i) ; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
                } if (flag == 0) {
                    System.out.printf("%d ",i);
            }
        }
    }
}