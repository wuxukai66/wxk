public class text2 {
        public static void main (String[]args){
            String str = "helloworld";
// 将字符串变为字符数组
            char[] data = str.toCharArray() ;
            for (int i = 0; i < data.length; i++) {
                System.out.print(data[i]+" ");
            }
// 字符数组转为字符串
            System.out.println(new String(data)); // 全部转换
            System.out.println(new String(data,5,5)); // 部分转换

        }
        public static void main7 (String[]args){
            System.out.println(divide(10, 0));
        }
        public static int divide ( int x, int y){
            if (y == 0) {
                throw new ArithmeticException("抛出除 0 异常");
            }
            return x / y;
        }

        public static void main5 (String[]args){
            int[] arr = {1, 2, 3};
            try {
                System.out.println("before");
                arr = null;
                System.out.println(arr[100]);
                System.out.println("after");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("finally code");
            }
        }
        public static void main4 (String[]args){
            int[] arr = {1, 2, 3};
            try {
                System.out.println("before");
                arr = null;
                System.out.println(arr[100]);
                System.out.println("after");
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("after try catch");
        }


        public static void main3 (String[]args){
            int[] arr = {1, 2, 3};
            try {
                System.out.println("before");
                arr = null;
                System.out.println(arr[100]);
                System.out.println("after");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("这是个数组下标越界异常");
                e.printStackTrace();
            } catch (NullPointerException e) {
                System.out.println("这是个空指针异常");
                e.printStackTrace();
            }
            System.out.println("after try catch");
        }


        public static void main2 (String[]args){
            int arr1[] = {1, 2, 3};
            try {
                System.out.println("before");
                System.out.println(arr1[100]);
                System.out.println("after");
            } catch (ArrayIndexOutOfBoundsException EX) {
                System.out.println("6565");
            }
        }


        public static void main1 (String[]args){
            try {
                System.out.println(10 / 0);
            } catch (ArithmeticException EX) {
                System.out.println("56656");
            }
        }
    }
