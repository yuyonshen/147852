
public class LinkedListTest2 {
    // 给内部类加 static 效果和其他的 static 类似. 让这个类和 LinkedListTest 类相关, 而和对象不相关.
    // 后续如果要创建 ListNode 的实例的话, 就不需要依赖 LinkedListTest 的实例
    static class ListNode {
        int val;
        ListNode next;

        
        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if( l1==null){
            return l2;
        }if(l2==null){
            return l1;
        }
        ListNode newHead=new ListNode(-1);
        ListNode newTail=newHead;
        ListNode cur1=l1;
        ListNode cur2=l2;
        while(cur1!=null&&cur2!=null){
            if(cur1.val<cur2.val){
                newTail.next=cur1;
                newTail=newTail.next;
                cur1=cur1.next;
            }else{
                newTail.next=cur2;
                newTail=newTail.next;
                cur2=cur2.next;
            }
        }
        if(cur1==null){
            newTail.next=cur2;
        }if(cur2==null){
            newTail.next=cur1;
        }
        return newHead.next;
    }

    public int size(ListNode head){
        int size=0;
        ListNode cur=head;
        while(cur!=null){
            size++;
            cur=cur.next;
        }
        return size;
    }
    public ListNode middleNode(ListNode head){
        int mun=size(head)/2;
        ListNode cur=head;
        for(int i=0;i<mun;i++){
            cur=cur.next;
        }
        return cur;
    }

    public ListNode reverseList(ListNode head){
        if(head==null){
            return head;
        }if(head.next==null){
            return head;
        }
        ListNode newHead=null;
        ListNode cur=head;
        ListNode prev=null;
        while(cur!=null){
            ListNode next=cur.next;
            if(next==null){
                newHead=cur;
            }
            cur.next=prev;
            prev = cur;
            cur = next;
        }
        return newHead;
    }

    public ListNode FindKthToTail(ListNode head, int k){
        if(head==null){
            return null;
        }if(head.next==null){
            return head;
        }
        int size=size(head);
        if(k<=0||k>size){
            return null;
        }
        int steps=size-k;
        ListNode cur=head;
        for(int i=0;i<steps;i++){
            cur=cur.next;
        }
        return cur;
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
            }else{
                prev=cur;
                cur=cur.next;
            }
        }
        if(prev.val==val){
            head=head.next;
        }
        return head;
    }

    public ListNode partition(ListNode pHead, int x) {

        if (pHead == null) {
            return null;
        }
        if (pHead.next == null) {
            return pHead;
        }
        ListNode bigHead = new ListNode(-1);
        ListNode bigTail = bigHead;
        ListNode smallHead = new ListNode(-1);
        ListNode smallTail = smallHead;

        for (ListNode cur = pHead; cur != null; cur = cur.next) {
            if (cur.val < x) {
                // 插入到 smallTail 后面, 创建崭新的节点(新节点的 next 一定是 null)
                smallTail.next = new ListNode(cur.val);
                smallTail = smallTail.next;
            } else {
                // 插入到 bigTail 的后面
                bigTail.next = new ListNode(cur.val);
                bigTail = bigTail.next;
            }
        }

        // 将两个链表收尾相接到一起
        smallTail.next = bigHead.next;
        return smallHead.next;
    }

    public static void main(String[] args) {
        // 构造一下刚才的数据, 本地测试一下
        ListNode a = new ListNode(9);
        ListNode b = new ListNode(5);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(7);
        ListNode e = new ListNode(3);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        int x = 4; // 基准值
        LinkedListTest2 test = new LinkedListTest2();
        ListNode result = test.partition(a, x);
        for (ListNode cur = result; cur != null; cur = cur.next) {
            System.out.println(cur.val);
        }
    }
}


