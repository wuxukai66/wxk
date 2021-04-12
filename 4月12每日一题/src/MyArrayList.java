import java.util.Arrays;
public class MyArrayList {
    private int usesize;
    private int[] elem;

    public MyArrayList() {
        this.elem = new int[5];
    }

    public MyArrayList(int n) {
        this.elem = new int[n];
    }

    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.display();
        System.out.println(myArrayList.search(5));
        myArrayList.insert(2,3);
        myArrayList.display();
        myArrayList.delete(2);
        myArrayList.display();
    }
    //打印数据表
    public void display() {
        for (int i = 0; i <this.usesize ; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }
    //输入
    public void add(int num){
        this.elem[this.usesize]=num;
        this.usesize++;
    }
    //扩容
    public void enlarge(){
        this.elem=Arrays.copyOf(this.elem,2*this.elem.length);
    }
    //查找元素
    public int search(int key) {
        for (int i = 0; i < this.usesize; i++) {
            if (this.elem[i] == key) {
                return i;
            }
        }
        return -1;
    }
    //插入元素
    public void insert(int pos, int data) {
         if(this.usesize==this.elem.length){
             System.out.println("顺序变已满");
             enlarge();
    }
         else{
             for (int i =this.usesize-1; i >=pos ; i--) {
                 this.elem[i+1]=this.elem[i];
             }
             this.elem[pos]=data;
             this.usesize++;
         }
    }
    //删除元素
    public void delete(int key){
        int index=search(key);
        for(int i=index;i<this.usesize-1;i++){
            this.elem[i]=this.elem[i+1];
        }
        this.usesize--;
    }
}