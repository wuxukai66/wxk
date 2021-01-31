public class HeapText {

    private int[] elem;
    public int usedSize;
    public HeapText() {
        this.elem = new int[10];
    }
    public void adjustDown(int parent, int len) {
        int child = 2*parent+1;
        //child < len 说明有左孩子
        while (child < len) {
            //ild+1 < len 判断是 当前是否  有右孩子
            if(child+1 < len && this.elem[child] < this.elem[child+1]) {
                child++;//
            }
            //child 下标 一定是 左右孩子的最大值下标
            if(this.elem[child] > this.elem[parent]) {
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                parent = child;
                child = 2*parent+1;
            }else {
                //因为是从最后一棵树开始调整的  只要我们 找到了这个
                // this.elem[child] <= this.elem[parent]   后续就不需要循环了
                //后面的都已经是大根堆了
                break;
            }
        }
    }
    public void crateBigHeap(int[] array) {
        for (int i = 0; i < array.length; i++) {
            this.elem[i] = array[i];
            this.usedSize++;
        }
        //elem当中已经存放了元素
        for(int i = (this.usedSize-1-1) /2; i>= 0;i--) {
            adjustDown(i,this.usedSize);
        }
    }
}
