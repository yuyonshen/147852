import java.LinkedListTest5;

public class LinkedListTest7 {
    static class ListNode {
        int val;
        ListNode next;
        public ListNode(int val){
            this.val=val;
        }
    }
    public ListNode partition(ListNode head, int x){
        if(head!=null){
            return null;
        }if(head.next==null){
            return head;
        }
        ListNode bigHead=new ListNode(-1);
        ListNode bigTail=bigHead;
        ListNode smallHead=new ListNode(-1);
        ListNode smallTail=smallHead;
        for(ListNode cur=head;cur!=null;cur=cur.next){
            if(cur.val<x){
                smallTail.next = new ListNode(cur.val);
                smallTail = smallTail.next;

            }else{
                bigTail.next=new ListNode(cur.val);
                bigTail=bigTail.next;
            }
        }
        smallTail.next=bigHead.next;
        return smallHead.next;
    }


    public ListNode reverseBetween(ListNode head, int m, int n){
     ListNode newHead=new ListNode(-1);
     ListNode newTail=newHead;
     ListNode a1=head;
     //截取的新链表
     for(int i=1;i<m;i++) {
         a1 = a1.next;
         newTail.next = a1;
         newTail = newTail.next;
     }
     ListNode b1=a1;
     for(int j=1;j<n;j++){
         if(j>m-1){
             newTail.next=b1;
             newTail=newTail.next;
             b1=b1.next;
         }
         b1=b1.next;
     }
     newHead.next=a1;
     //反转之后的链表
     ListNode newHead2 = null;
        ListNode cur = newHead.next;
        ListNode prev = null;
        while (cur != null) {
            ListNode next = cur.next;
            if (next == null) {
                // 当前 cur 就是原链表的末尾
                newHead2 = cur;
            }
            // 逆置的核心操作
            cur.next = prev;
            // 更新三兄弟的指向位置
            prev = cur;
            cur = next;
        }
        //链接反转之后的链表
        ListNode c1=head;
        for(int i=1;i<m-1;i++){
            c1=head.next;
        }
        ListNode d1=head;
        for(int j=1;j<n-1;j++){
            d1=d1.next;
        }
        ListNode e1=head;
        for(int i=0;i<n;i++){
            e1=e1.next;
        }
        c1.next=newHead2;
        prev.next=e1;
        return head;
    }

    public ListNode removeElements(ListNode head, int val){
        if(head==null){
            return null;
        }
        ListNode prev=head;
        ListNode cur=head.next;
        while(cur!=null){
            if(cur.val==val){
                prev.next=cur.next;
                cur=prev.next;
            }
            prev=cur;
            cur=cur.next;
        }
        if(head.val==val){
            head=head.next;
        }
        return head;
    }

    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }if(head.next==null){
            return head;
        }
        ListNode prev=null;
        ListNode cur=head;
        ListNode newHead=null;
        while(cur!=null){
            ListNode next=cur.next;
            if(next==null){
                newHead=cur;
            }
            cur.next=prev;
            prev=cur;
            cur=next;

        }
        return newHead;

    }

    public ListNode middleNode(ListNode head){
            int size=size(head);
            int tamp=size/2;
            ListNode cur=head;
            for(int i=0;i<tamp;i++){
                cur=cur.next;
            }
            return cur;
    }
    public int size(ListNode head){
        int size=0;
      ListNode cur=head;
        for(int i=0;cur!=null;cur=cur.next){
            size++;
        }
        return size;
    }

    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null) {
            return null;
        }
        if (k <= 0 || k > size(head)) {
            return null;
        }
        int tamp = size(head) - k;
        ListNode cur = head;
        for (int i = 0; i < tamp; i++) {
            cur = cur.next;
        }
        return cur;
    }
}
