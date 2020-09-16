package LinkedList;

import java.util.ArrayList;
import java.util.Collections;

public class MergeKsorted {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  /*
   Approach 1
   Brute Force
   Time Complexity == O(N log N)
   Space Complexity == O(N)
   */
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(ListNode ln : lists){
            while(ln != null){
                arr.add(ln.val);
                ln = ln.next;
            }
        }
        Collections.sort(arr);
        System.out.println(arr);
        ListNode head = new ListNode(0);
        ListNode temp = head;
        for(Integer c : arr){
            ListNode n = new ListNode(c);
            temp.next = n;
            temp =  temp.next;
        }
        return head.next;
    }
    /*
     Approach 2
     Check One by One
     Time Complexity ==
     Space Complexity ==
     */
    public ListNode mergeKLists2(ListNode[] lists){
        ListNode head = new ListNode(0);
        ListNode temp = head;
        int minIndex = 0;
        while (true){
            boolean breaker = true;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < lists.length; i++) {
                if(lists[i] != null){
                    if(lists[i].val < min){
                        min = lists[i].val;
                        minIndex = i;
                    }
                    breaker = false;
                }
            }
            if(breaker) {
                break;
            }
            ListNode node = new ListNode(lists[minIndex].val);
            temp.next = node;
            temp = temp.next;
            lists[minIndex] = lists[minIndex].next;
        }
       temp.next = null;
        return head.next;
    }
}
