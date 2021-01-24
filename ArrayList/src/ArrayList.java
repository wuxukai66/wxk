import java.util.Arrays;

public class ArrayList {

        private int usedSize;
        private int[] elem;

        public ArrayList () {
            this.elem = new int[5];
        }

        public ArrayList (int n) {
            this.elem = new int[n];
        }

        public static void main(String[] args) {

            ArrayList ArrayList = new ArrayList ();
            ArrayList.add(1);
            ArrayList.add(2);
            ArrayList.add(3);
            ArrayList.display();
            System.out.println(ArrayList.serach(3,2));
            ArrayList.insert(2,3);
            ArrayList.display();
            ArrayList.remove(2);
            ArrayList.display();
        }
        //打印数据表
        public void display() {
            for (int i = 0; i <this.usedSize ; i++) {
                System.out.print(this.elem[i]+" ");
            }
            System.out.println();
        }
        //输入
        public boolean add(int num){
            if (isFull()) {
                return false;
            }
            this.elem[this.usedSize]=num;
            this.usedSize++;
            return true;
        }
    //是否为满
    public boolean isFull(){
        if(this.usedSize == this.elem.length){
            return true;
        }
        return false;
    }
    //插入
    public boolean insert(int pos,int val) {
        if(isFull()){
            this.elem = Arrays.copyOf(this.elem,this.elem.length*2);//2倍扩容
            // return false;
        }
        //1.判断pos位置合法性  （pos是下标）
        if(pos < 0 || pos > this.usedSize) {
            return false;
        }
        //2.挪开pos位置的数据
        for(int i = this.usedSize-1;i >= pos;i--) {
            this.elem[i+1] = this.elem[i];
        }
        //3.放入val
        this.elem[pos] = val;
        this.usedSize++;
        return true;
    }
    //判空
    public boolean isEmpty(){
        if(this.usedSize == 0) {
            return true;
        }
        return false;
    }
    //查找
    public int serach(int pos,int key) {
        if (isEmpty()) {
            System.out.println("链表为空！");
            return -1;
        }
        if (pos < 0 || pos >= this.usedSize) {
            return -1;
        }
        for (int i = pos; i < this.usedSize; i++) {
            if (elem[i] == key) {
                return i;
            }
        }
        return -1;
    }
    //删除
    public boolean remove(int key) {
        if (isEmpty()) {
            return false;
        }
        int index = serach(0,key);
        if (index < 0) {
            return false;
        }
        for (int i = index; i < this.usedSize - 1; i++) {

            this.elem[i] = this.elem[i + 1];

        }
        this.usedSize--;
        return true;
    }
    //打印
    public void show() {
        for(int i = 0;i< this.usedSize;i++) {
            System.out.print(this.elem[i]+ " ");
        }
        System.out.println();
    }

}


