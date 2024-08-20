package Leetcode;

//using recursion
public class PalindromeLinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static ListNode curr;

    public static boolean isPalindrome(ListNode head) {
        curr = head;
        return solve(head);
    }

    public static boolean solve(ListNode head) {
        if (head == null)
            return true;
        boolean ans = solve(head.next) && head.val == curr.val;
        curr = curr.next;
        return ans;
    }

    public static void main(String[] args) {

        int[] values = { 1, 1, 2, 1 };

        ListNode head = new ListNode(values[0]);
        ListNode curr = head;

        for(int i=1;i<values.length;i++){

            curr.next= new ListNode(values[i]);
            curr = curr.next;
         
        }
        
        boolean result = isPalindrome(head);
        System.out.println("Is the linked list a palindrome? " + result);

    }
}