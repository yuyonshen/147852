package Extends;

public class LinkedListTest10 {
    static class ListNode{
        ListNode next;
        int val;
        public ListNode(int val){
            this.val=val;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode newHead=new ListNode(-1);
        ListNode newTail=newHead;
        ListNode cur1=l1;
        ListNode cur2=l2;
        while(cur1!=null&&cur2!=null){
            if(l1.val<l2.val){
                newTail.next=new ListNode(cur1.val);
                newTail=newTail.next;
                cur1=cur1.next;
            }else{
                newTail.next=new ListNode(cur2.val);
                newTail=newTail.next;
                cur2=cur2.next;
            }

        }
        if(cur1==null){
            newTail.next=cur2;
        }else{
            newTail.next=cur1;
        }
        return newHead.next;
    }

    public ListNode partition(ListNode pHead, int x) {
        if(pHead==null){
            return null;
        }
        if(pHead.next==null){
            return pHead;
        }
        ListNode samllHead=new ListNode(-1);
        ListNode samllTail=samllHead;
        ListNode bigHead=new ListNode(-1);
        ListNode bigTail=bigHead;
        ListNode cur=pHead;
        while(cur!=null){
            if(cur.val<x){
                samllTail.next=cur;
                cur=cur.next;
                samllTail=samllTail.next;
            }else{
                bigTail.next=cur;
                cur=cur.next;
                bigTail=bigTail.next;
            }
        }
        samllTail.next=bigHead.next;
        return samllHead.next;
    }

    public ListNode deleteDuplication(ListNode pHead)
    {
        ListNode newHead=new ListNode(-1);
        ListNode newTail=newHead;
        ListNode cur=pHead;
        while(cur!=null){

            if(cur.next!=null&&cur.val==cur.next.val){
                while(cur.next!=null&&cur.next.val==cur.val){
                    cur=cur.next;
                }
                cur=cur.next;
            }else{
                newTail.next=cur;
                cur=cur.next;
                newTail=newTail.next;
            }
        }
        return newHead.next;

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA=size(headA);
        int sizeB=size(headB);
        if(sizeA>sizeB){
            int temp=sizeA-sizeB;
            for(int i=0;i<temp;i++){
                headA=headA.next;
            }
        }else{
            int tmp=sizeB-sizeA;
            for(int j=0;j<tmp;j++){
                headB=headB.next;
            }
        }
        while(headA!=null&&headB!=null){
            if(headA==headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return null;

    }
    public int size(ListNode head){
        int size=0;
        ListNode cur=head;
        for(int i=0;cur!=null;cur=cur.next){
            size++;
        }
        return size;
    }

    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }

    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                break;
            }
        }
        if(fast==null||fast.next==null){
            return null;
        }
        ListNode cur1=head;
        ListNode cur2=fast;
        while(cur1!=cur2){
            cur1=cur1.next;
            cur2=cur2.next;
        }
        return cur1;
    }

    
}
