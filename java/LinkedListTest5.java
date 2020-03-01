package java;




public class LinkedListTest5 {


    static class ListNode {
        int val;
        ListNode next;
        public ListNode(int val){
            this.val=val;
        }
    }
    public ListNode detectCycle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                break;
            }
        }
        if(fast==null||fast.next.next==null){
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

    public boolean hasCycle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        int a=size(headA);
        int b=size(headB);
        if(a>b){
            int tamp=a-b;
            for(int i=0;i<tamp;i++){
                headA=headA.next;
            }


        }else{
            int tamp=b-a;
            for(int j=0;j<tamp;j++){
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


    public boolean chkPalindrome(ListNode A){
        int size=size(A);
        int tamp=size/2;
        ListNode B=A;
        for(int i=0;i<tamp;i++){
            B=B.next;
        }
        ListNode prev = null;
        ListNode cur = B;
        while(cur!=null){
            ListNode next=cur.next;
            if(cur==null){
                B=cur;
            }
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        while(B!=null){
            if(B.val!=A.val){
                return false;
            }
            B=B.next;
            A=A.next;
        }
        return true;
    }

    public ListNode deleteDuplication(ListNode pHead){
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
}
