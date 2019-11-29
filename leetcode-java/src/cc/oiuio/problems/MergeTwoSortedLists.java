package cc.oiuio.problems;

public class MergeTwoSortedLists {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if( l1.val < l2.val){
                return l1.next = mergeTwoLists(l1.next,l2);
            } else {
                return l2.next = mergeTwoLists(l1,l2.next);
            }
        }

    }

    public static void main(String[] args) {
    }
}