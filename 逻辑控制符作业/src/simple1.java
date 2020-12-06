public class simple1 {
    public static void main(String[] args) {
        jisuangeshu();
    }
//1-100内9的个数
    public static void jisuangeshu() {
        int count = 0;
        int i = 0;
        for (i = 1; i < 100; i++) {
            if (i % 10 == 9 ) {
                count++;
            } if(i/10==9){
                count++;
            }
            }System.out.println(count);
        }
    }
