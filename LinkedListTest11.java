public class LinkedListTest11 {
    static class ListNode{
        ListNode next;
        int val;
        public ListNode (int val) {
            this.val = val;
        }
    }

    //找中心节点；
    public ListNode middleNode(ListNode head){
        if(head==null){
            return null;
        }
        ListNode slow=head;
       ListNode fast=head;
       ListNode prvSlow=null;
       while(fast!=null&&fast.next!=null){
           prvSlow=slow;
           fast=fast.next.next;
           slow=slow.next;
       }
       return slow;
    }
   //反转后侧链表
   public void reorderList(ListNode head){
        if(head==null){
            return ;
        }
        ListNode middle=middleNode(head);
       ListNode left = head;
       ListNode right = middle.next;
       middle.next = null;
       //2.2 反转右链表
       //原始右链表：4->5 反转后：5->4
       right = reverse(right);

       //3. 合并两个链表，将右链表插入到左链表
       //左链表：1->2->3 右链表：4->5 合并后：1->5->2->4->3
       merge(left,right);
   }
   //反转链表
    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode last = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

    public void merge(ListNode left, ListNode right){
        ListNode leftTemp;
        ListNode rightTemp;
        while (left.next != null && right!= null) {
            //1. 保存next节点
            leftTemp = left.next;
            rightTemp = right.next;

            //2. 将右链表的第一个节点插入到左链表中
            // 左链表：1->2->3 右链表：5->4
            // 合并后的左链表：1->5->2->3
            left.next = right;
            right.next = leftTemp;

            //3. 移动left和right指针
            //左链表变为：2->3 右链表变为：4
            left = leftTemp;
            right = rightTemp;
        }
    }
}
