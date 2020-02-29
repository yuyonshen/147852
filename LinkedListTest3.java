public class LinkedListTest3 {
    static class ListNode {
        ListNode next;
        int val;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = head.next;
            fast = head.next.next;
            if (slow == fast) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        ListNode cur1 = head;
        ListNode cur2 = fast;
        while (cur1 != cur2) {
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return cur1;
    }

    //判断一个链表中是否有环
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = head.next.next;
            slow = head.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    //输入两个链表找出他们的公共节点
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size1 = size(headA);
        int size2 = size(headB);
        int tamp = 0;
        if (size1 > size2) {
            tamp = size1 - size2;
            for (int i = 0; i < tamp; i++) {
                headA = headA.next;
            }
        } else {
            tamp = size2 - size1;
            for (int j = 0; j < tamp; j++) {
                headB = headB.next;
            }
        }
        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    public int size(ListNode head) {
        int size = 0;
        ListNode cur = head;
        for (int i = 0; cur != null; cur = cur.next) {
            size++;
        }
        return size;
    }

    //判断是否为回文链表
    public boolean chkPalindrome(ListNode A) {
        int size = size(A);
        int steps = size / 2;
        ListNode B = A;
        for (int i = 0; i < steps; i++) {
            B = B.next;
        }
        ListNode prev = null;
        ListNode cur = B;
        while (cur != null) {
            ListNode next = cur.next;
            if (next == null) {
                B = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        while (B != null) {
            if (B.val != A.val) {
                return false;
            }
            A = A.next;
            B = B.next;
        }
        return true;
    }

    //删除链表中的所有重复节点
    public ListNode deleteDuplication(ListNode pHead) {
        ListNode newHead = new ListNode(-1);
        ListNode tail = newHead;
        ListNode cur = pHead;
        while (cur != null) {
            if (cur.next != null && cur.val == cur.next.val) {

                while (cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                cur = cur.next;
            } else {
                tail.next = cur;
                tail = tail.next;
                cur = cur.next;
            }

        }
        return newHead.next;
    }


}
