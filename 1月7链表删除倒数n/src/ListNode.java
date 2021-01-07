import java.util.List;

public class ListNode {
    int data;
    ListNode next;
    public  ListNode(){

    }
    public  ListNode(ListNode head, int data) {

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head;
        ListNode slow=head;
        if(head==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        if(fast!=null&&fast.next!=null){
            while(n!=0){
                fast=fast.next;
                n--;
                if(fast.next==null){
                    if(n==1){
                        head=head.next;
                        return head;
                    }
                }
            }
            while(fast!=null&&fast.next!=null){
                fast=fast.next;
                slow=slow.next;
            }
            slow.next=slow.next.next;

        } return head;
    }
}

