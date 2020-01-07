package java;

import java.util.List;

class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

}

public class LinkedList {//反转一个链表
    private ListNode head = null;
    public ListNode reverseList(ListNode head) {
        // 如果为第一个元数
        if(head.next==null){
            return null;
        }
        //空链表
        if(head==null){
            return null;
        }
        //一般情况
        ListNode newhead=null;
        ListNode cur=head;
        ListNode prev=null;
        while(cur!=null){
            ListNode next=cur.next;
            if(next==null){
                newhead=next;
            }
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return newhead;
    }
    public ListNode middleNode(ListNode head){
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        int size=getSize(head)/2;
        ListNode cur=head;
        for(int i=0;i<size;i++){
            cur=cur.next;
        }
        return cur;
    }

    public ListNode FindKthToTail(ListNode head, int k){
        int size=getSize(head);
        if(k<0||k>size){
            return null;
        }
        ListNode cur=head;
        for(int i=0;i<size-k;i++){
            cur=cur.next;
        }
        return cur;
    }

    public void remove(  int val){
        //如果删除的节点是都元素
        if(head.val==val){
            head=head.next;
        }
        ListNode prev=searchPrev( val);
        ListNode toDelete = prev.next;
        prev.next = toDelete.next;


    }

     private ListNode searchPrev(int toRemove){// 找到 toRemove 的前一个节点
        for(ListNode cur=head;cur!=null&&cur.next!=null;cur=cur.next){
            if(cur.next.val==toRemove){
            return cur;
            }

        }
        return null;
     }
    public int getSize(ListNode head){
        int size=0;
        for(ListNode cur=head;cur!=null;cur=cur.next){
            size++;
        }
        return size;
}


}

