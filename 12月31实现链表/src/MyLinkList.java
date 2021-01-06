class Node{
    public int data;
    public Node next;
    public Node(){

    }
    public Node(int data){
        this.data=data;
    }
}
public class MyLinkList {
    public Node head;
    //头插节点
public void addfirst(int data){
    Node node=new Node(data);
    if(this.head==null){
        this.head=node;
    }
    else{
        node.next=this.head;
        this.head=node;
    }
}
//打印链表
public void show(){
    Node cur=this.head;
    if(this.head==null){
   return;
    }
    while(cur!=null){
        System.out.print(cur.data+" ");
        cur=cur.next;
    }
}
//查找
    public Node search(int key){
    Node cur=this.head;
    while(cur!=null){
        if(cur.data==key){
            return cur;
        }
        cur=cur.next;
    }
    return null;
    }
    //删除
    public  void remove(int key){
    if(this.head==null){
        return;
    }
    Node cur,p;
    for(p=cur=this.head;cur!=null&&cur.data!=key;p=cur,cur=cur.next);
    if(cur==null){
        System.out.println("没有要删除的节点");
        return;
    }
        if(this.head.data==key){
        this.head=this.head.next;
    }
        if(cur.data==key){
            p.next=cur.next;
        }
    }
    //反转链表（逆置链表）
    public void reverse(){
    Node cur=this.head;
    Node p=null;
    Node newHead=null;
    Node q=cur.next;
    while(q!=null){
        if( q==null){
            newHead=cur;
        }
        cur.next=p;
        p=cur;
        cur=q;
        q=q.next;
    }
        cur.next=p;
        this.head=cur;
    }
    //找中间节点
    public Node midNode(){
    Node fast=this.head;
    Node slow=this.head;
    while(fast.next!=null&&fast!=null){
        fast=fast.next.next;
        slow=slow.next;
    }
    return  slow;
    }
    //清除链表
    public  void clear(){
        this.head=null;
    }
    //删除重复的节点
    public void cutsame(int key){
    Node cur,p;
    p=cur=this.head;
    if(this.head!=null){
    while(cur!=null){
        if(cur.data==key){
            p.next=cur.next;
            cur=cur.next;
        }
        else{
            p=cur;
            cur=cur.next;
        }
    }
    p=this.head;
    if(this.head.data==key){
        p=p.next;
        this.head=p;
    }
    }else{
        return ;
    }
}
//尾插法
public void addlast(int data){
    Node node=new Node(data);
    Node cur=this.head;
    if(this.head==null){
        this.head=node;
    }
    else{
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=node;
    }
}
}

