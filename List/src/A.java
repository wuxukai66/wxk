public class A<T> {

        T value;
        A(T value){
            this.value=value;
        }
        T get(){
            return this.value;
        }

        public static void main(String[] args) {
            A<Integer> text=new A<>(10);
            Integer c=text.get();
            System.out.println(c);
        }
    }


