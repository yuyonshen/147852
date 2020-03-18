public class Solution13 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        int[] arr = new int[10000];
        for (int i = 0; i < lists.length; i++) {
            ListNode cur = lists[i];
            for (int j = 0; cur != null; cur = cur.next) {
                arr[0] = cur.val;
            }
        }
        ListNode Head=new ListNode(-1);
        ListNode tair=Head;
        for (int b = 0; b < arr.length - 1; b++) {
            for (int c = b + 1; c < arr.length; c++) {
                if (arr[b] > arr[c]) {
                    int temp = arr[b];
                    arr[b] = arr[c];
                    arr[c] = temp;
                }

            }
            tair.next=new ListNode(arr[b]);
            tair=tair.next;

        }
        return Head.next;
    }

    public String longestCommonPrefix(String[] strs){
        if(strs==null||strs.length==0){
            return"";
        }
        for(int i=0;i<strs[0].length();i++){
            char c=strs[0].charAt(i);
            for(int j=0;j<strs.length;j++){
                if(i==strs[j].length()||strs[j].charAt(i)!=c){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}
