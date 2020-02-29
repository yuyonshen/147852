class ListNode {
    ListNode next;
    int val;

    public ListNode(int val) {
        this.val = val;
    }
}
public class LinkedListTest4 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2;
        ListNode curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public int size(ListNode head){
        int size=0;
        ListNode cur=head;
        for(int i=0;cur!=null;cur=cur.next) {
            size++;
        }
        return size;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=size(head);
        ListNode newHead=new ListNode(0);
        ListNode newTail=newHead;
        ListNode cur=head;
        int temp=size-n;
      while(temp>0){
          temp--;
          cur=cur.next;
      }
      cur.next=cur.next.next;
      return newHead.next;
    }

    public LinkedListTest3.ListNode mergeTwoLists(LinkedListTest3.ListNode l1, LinkedListTest3.ListNode l2) {

        LinkedListTest3.ListNode newHead=new LinkedListTest3.ListNode(0);
        LinkedListTest3.ListNode newTail=newHead;
        LinkedListTest3.ListNode cur1=l1;
        LinkedListTest3.ListNode cur2=l2;
        while(cur1!=null&&cur2!=null){
            if(cur1.val<cur2.val){
                newTail.next=cur1;
                cur1=cur1.next;
                newTail=newTail.next;
            }else{
                newTail.next=cur2;
                cur2=cur2.next;
                newTail=newTail.next;
            }

        }
        if(l1==null){
            newTail.next=cur2;
        }
        if(l2==null){
            newTail.next=cur1;
        }
        return newHead.next;

    }
    public ListNode swapPairs(ListNode head){
        ListNode newHead=new ListNode(-1);
        ListNode newTail=newHead;
        if(head==null||head.next==null){
            return head;
        }

        while(head!=null&&head.next!=null){
            ListNode cur=head;
            ListNode prev=head.next;

            newTail.next=prev;
            cur.next=prev.next;
            prev.next=cur;

            newTail=cur;
           head=cur.next;

        }
        return newHead.next;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode cur = head;
        int n;
        for (n = 1; cur .next!= null; n++) {
            cur = cur.next;
        }
        cur.next = head;
        ListNode newtail = head;
        for (int i = 0; i < (size(head) - k - 1); i++) {
            newtail = newtail.next;

        }
        ListNode newHead = newtail.next;
        newtail.next = null;
        return newHead;
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }if(head.next==null){
            return head;
        }
        ListNode newHead=new ListNode(-1);
        ListNode newTail=newHead;
        ListNode cur=head;
        while(cur!=null){
            if(cur.next!=null&&cur.val==cur.next.val){
                while(cur.next!=null&&cur.val==cur.next.val){
                    cur=cur.next;
                }
                cur=cur.next;
            }else{
                newTail.next=new ListNode(cur.val);
                newTail=newTail.next;
                cur=cur.next;
            }


        }
        return newHead.next;

    }
}

