//调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
public class text5 {
    public static void main(String[] args) {
        tiaoxu();
    }

    public static void tiaoxu() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = new int[arr.length];
        int i = 0;
        int j = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                for (j = 0; j < arr.length; j++) {
                    if (arr[j] % 2 == 0) {
                        int tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                        break;
                    }
                    }
                }
            }for (int a : arr) {
            System.out.println(a);
        }
    }
}
//        for(q=0;q<=arr.length;q++){
//            if(arr[q]%2==0){
//                arr2[j--]=arr[q];
//            }
//            else{
//                arr2[i++]=arr[q];
//            }