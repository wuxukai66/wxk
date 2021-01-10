class ListNode{
    public int val;
    public ListNode prev;
    public ListNode next;
    public ListNode(int val){
        this.val=val;
    }
}
public class doubleLinklist {
    ListNode head;
    ListNode last;
    //头插法
    public void addFirst(int val){
        ListNode node=new ListNode(val);
        if(this.head==null){
            this.head=node;
            this.last=node;
        }else{
            node.next=this.head;
            this.head.prev=node;
            //node.prev=null;
            this.head=node;
        }

    }
    //求长度
    public int sizeOf(){
        int count=0;
        ListNode cur=this.head;
        while(cur!=null){
            cur=cur.next;
            count++;
        }
        return count;
    }
    //查找
    public boolean contains(int key){
        ListNode cur=this.head;
        while(cur!=null){
            while(cur.val!=key){
                cur=cur.next;
            }
            if(cur.val==key){
                return true;
            }
        }
        return false;
    }
    //在任意位置插入节点
    public void addIndex(int index,int data){
        if(index<0||index>sizeOf()){
            return;
        }
        if(index==0){
            addFirst(data);
            return;
        }
        if(index==sizeOf()){
            addLast(data);
            return;
        }
        ListNode cur=this.head;
        while(index!=0){
            cur=cur.next;
            index--;
        }
        ListNode node=new ListNode(data);
        node.next=cur;
        node.prev=cur.prev;
        node.prev.next=node;
        cur.prev=node;
    }
    //删除第一次出现的值为key的节点
    public void remove(int key){
        ListNode cur=this.head;
        if(this.head.val==key){
            this.head.next.prev=null;
            this.head=this.head.next;
        }else{
            while(cur!=null){
                while ((cur.val!=key)){
                    cur=cur.next;
                }
                if(cur.val==key){
                    if(cur==this.last){
                        cur.prev.next=null;
                        this.last=this.last.prev;
                    }else{
                        cur.next.prev=cur.prev;
                        cur.prev.next=cur.next;
                    }


                    return;
                }
            }
        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        ListNode cur=this.head;
            while(cur!=null){
                if(cur.val==key){if(this.head.val==key){
                    this.head.next.prev=null;
                    this.head=this.head.next;
                }
                     else if(cur==this.last){
                        cur.prev.next=null;
                        this.last=this.last.prev;
                    }else{
                        cur.next.prev=cur.prev;
                        cur.prev.next=cur.next;
                    }
                }cur=cur.next;
                }
    }
    //清除链表
    public void clear(){
        this.head=null;
        this.last=null;
    }
    //打印
    public void display(){
        ListNode cur=this.head;
        while (cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    //尾插法
    public  void addLast(int val){
        ListNode node=new ListNode(val);
        if(this.head==null){
            this.head=node;
            this.last=node;
        }else{
            this.last.next=node;
            node.prev=this.last;
            this.last=node;
        }
    }
}
