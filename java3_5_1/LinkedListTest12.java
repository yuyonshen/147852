package java3_5_1;

public class LinkedListTest12 {
 static class ListNode {
     ListNode next;
     int val;
     public ListNode(int val){
         this.val=val;
     }
 }
 //回文链表
    public boolean isPalindrome(ListNode head) {
        int size = size(head);
        int temp = size / 2;
        ListNode B = head;
        for (int i = 0; i < temp; i++) {
            B = B.next;
        }
        ListNode prve = null;
        ListNode cur = B;
        while (cur != null) {
            ListNode next = cur.next;
            if (next == null) {
                B = cur;
            }
            cur.next = prve;
            prve = cur;
            cur = next;

        }
        while (B != null) {
            if (B.val != head.val) {
                return false;
            }
            B = B.next;
            head = head.next;
        }
        return true;
    }
    public int size(ListNode head){
     int size=0;
     ListNode cur=head;
     for(int i=0;cur!=null;cur=cur.next){
         size++;
     }
     return size;
    }

    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode newHead=new ListNode(-1);
        ListNode newTail=newHead;
        ListNode newHead2=new ListNode(-1);
        ListNode newTail2=newHead2;

        ListNode cur=head;
        ListNode prv=head.next;
        while(cur!=null&&cur.next!=null){
            newTail.next=cur;
            newTail=newTail.next;
            cur=cur.next.next;
            newTail2.next=prv;
            newTail2=newTail2.next;
            prv=prv.next.next;
        }
        newTail.next=newHead.next;
        return newHead.next;
    }

    public ListNode[] splitListToParts(ListNode root, int k){
     ListNode cur=root;
     int n=0;
     while(cur!=null){
         n++;
         cur=cur.next;
     }
     int width=n/k;
     int rem=n%k;
        ListNode[] ans = new ListNode[k];
        cur = root;
        for (int i = 0; i < k; ++i) {
            ListNode head = new ListNode(0), write = head;
            for (int j = 0; j < width + (i < rem ? 1 : 0); ++j) {
                write = write.next = new ListNode(cur.val);
                if (cur != null) cur = cur.next;
            }
            ans[i] = head.next;
        }
        return ans;

    }
}
